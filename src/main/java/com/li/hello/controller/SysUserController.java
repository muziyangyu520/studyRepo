package com.li.hello.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.li.hello.common.diyAnnotation.LogAspectAnnotation;
import com.li.hello.commons.utils.ResResult;
import com.li.hello.entity.SysUser;
import com.li.hello.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * 后台用户信息控制层
 */
@RestController
@RequestMapping("sysUser")
public class SysUserController {

    @Autowired
    private SysUserMapper userMapper;

    @LogAspectAnnotation("查询用户列表")
    @RequestMapping(value = "list")
    public List<SysUser> findList(){
        PageHelper.startPage(0,2);
        Page<SysUser> page = (Page<SysUser>) userMapper.findList();
        System.out.println(page.getResult());
        System.out.println(page.getTotal());
        System.out.println(page.getPageNum());
        System.out.println(page.getPages());

        return userMapper.findList();
    }

    @RequestMapping("getPage")
    public ResResult getPage(){
        Map<String,Object> map = new HashMap<>();
        //分页
        PageHelper.startPage(0,2);

        Page<SysUser> page = (Page<SysUser>) userMapper.findList();
        //响应结果
        ResResult<SysUser> resResult = ResResult.resultHelper(page);
        resResult.setMsg("555555555");
        return resResult;
    }

    @RequestMapping("page")
    public ModelAndView toPage(HttpServletRequest request){
        Enumeration enumeration = request.getHeaderNames();
        System.out.println(JSONObject.toJSON(enumeration).toString());
        System.out.println(request.getHeader("cookie"));
        String path = request.getServletContext().getRealPath("file/1527844307.png");
        request.setAttribute("filePath",path);
        return new ModelAndView("index");
    }

}
