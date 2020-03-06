package com.xu.common;


import java.io.Serializable;


public class ResultUtils implements Serializable{


    // 响应业务状态
    private Integer code;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    public static ResultUtils build(Integer code, String msg, Object data) {

        return new ResultUtils(code, msg, data);
    }

    public static ResultUtils ok(Object data) {

        return new ResultUtils(data);
    }

    public static ResultUtils ok() {
        return new ResultUtils(null);
    }

    public ResultUtils() {

    }

    public static ResultUtils build(Integer code, String msg) {

        return new ResultUtils(code, msg, null);
    }

    public ResultUtils(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultUtils(Object data) {
        this.code = 200;
        this.msg = "OK";
        this.data = data;
    }


    public Integer getStatus() {

        return code;
    }

    public void setStatus(Integer code) {

        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}
