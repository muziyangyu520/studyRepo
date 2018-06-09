package com.li.hello.controller;

import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Date;

/**
 * 文件上传 、下载
 */
@RestController
public class UploadFileController {

    /**
     * 单文件上传
     * @param file
     * @return
     */
    @PostMapping(value = "upload")
    public String uploadFile(@RequestParam("file") MultipartFile file,String name){
        //获取字符串字段
        System.out.println(name);
        String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();

        path = path.substring(0,path.indexOf("target"));
        if(!file.isEmpty()){
            File outputFile = new File(path+"src/main/resources/upload/"+file.getOriginalFilename());

            InputStream is = null;
            OutputStream os = null;
            try {
                is = file.getInputStream();

                os = new FileOutputStream(outputFile);

                byte [] buff = new byte [1024];
                int len = 0;
                while((len = is.read()) != -1){
                    os.write(buff,0,len);
                }

            } catch (IOException e) {


            }finally {
                try {
                    os.close();
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }

    /**
     * 多文件上传
     * @param files
     * @param name
     * @return
     * @throws IOException
     */
    @PostMapping(value = "uploads")
    public String uploadFiles(@RequestParam("files") MultipartFile [] files,String name) throws IOException {
        //获取字符串字段
        System.out.println(name);
        String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();

        path = path.substring(0,path.indexOf("target"));
        if(files != null && files.length > 0){
            File outputFile = null;

            InputStream is = null;
            OutputStream os = null;
                for(int i = 0; i < files.length; i++){
                    outputFile = new File(path+"src/main/resources/upload/"+files[i].getOriginalFilename());
                    is = files[i].getInputStream();
                    os = new FileOutputStream(outputFile);
                    outputStream(is,os);
                }

        }

        return null;
    }

    public void outputStream(InputStream is,OutputStream os) throws IOException {
        byte [] buff = new byte [1024];
        int len = 0;
        while((len = is.read()) != -1){
            os.write(buff,0,len);
        }
        try {
            os.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 下载文件
     */
    @RequestMapping( value = "downLoadFile")
    public void downLoadFile(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("开始下载");
        response.setCharacterEncoding("utf-8");//设置响应编码格式
        String filePath = request.getParameter("filePath");
        filePath = request.getServletContext().getRealPath("file/"+filePath);
        filePath = new String(filePath.getBytes("gbk"));//以支持中文文件和路径
        File file = new File(filePath);
        //使用缓冲流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));//获取输入流
        BufferedOutputStream buff = new BufferedOutputStream(response.getOutputStream());//获取响应输出流
        //设置响应头
        String fileName = new String(file.getName().getBytes("gbk"),"iso-8859-1");//浏览器下载时正确显示中文文件名
        response.addHeader("Content-Disposition","attachment;filename="+fileName);
        response.addHeader("Content-Length",file.length()+"");//客户端需要通过Content-Length来检测报文截尾
        response.setContentType("application/octet-stream");//设置响应正文类型
        System.out.println("开始时间"+new Date());
        byte [] bytes = new byte[1024];
        int len = 0;
        while((len = bis.read(bytes)) != -1){
            buff.write(bytes,0,len);
        }
        buff.close();
        bis.close();
        System.out.println("结束时间"+new Date());
    }
}
