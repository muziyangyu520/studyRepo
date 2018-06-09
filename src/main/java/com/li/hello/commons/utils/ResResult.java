package com.li.hello.commons.utils;
import com.li.hello.commons.constant.*;
import com.github.pagehelper.Page;
import com.li.hello.commons.enums.CodeEnum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResResult <T> {
//    {success=true, code='XXXX', msg='返回信息', data=返回的数据 }
    private  boolean success = true;//默认请求成功

    private String code = SysConstants.CodeConst.CODE_0000;//默认请求成功

    private String msg = "查询成功";

    private Map<String,Object> data = new HashMap<>();

    public ResResult() {

    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public static ResResult resultHelper(Page page){
        ResResult r = new ResResult();

        if(page.getResult() != null){
            r.getData().put("list",page.getResult());
            r.getData().put("total",page.getTotal());
            r.getData().put("pageNum",page.getPageNum());
            r.getData().put("pageSize",page.getPageSize());
        }
        return r;
    }
}
