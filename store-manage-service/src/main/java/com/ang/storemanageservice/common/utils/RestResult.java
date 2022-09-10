package com.ang.storemanageservice.common.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * 返回结果
 *
 * @author angang
 * @date 2022/08/30
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RestResult<T> {
    private int code;
    private String msg;
    private T data;
    private Throwable throwable;//异常等

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 异常堆栈信息
     *
     * @return String 堆栈信息
     */
    @JsonIgnore
    public String getThrowableStackTrace() {
        if (this.throwable != null) {
            StringWriter sw = new StringWriter();
            this.throwable.printStackTrace(new PrintWriter(sw));
            return sw.toString();
        }
        return null;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

    //成功，不返回具体数据
    public static <T> RestResult<T> successNoData(ResultCode code) {
        RestResult<T> result = new RestResult<T>();
        result.setCode(code.getCode());
        result.setMsg(code.getMsg());
        return result;
    }

    //成功，返回数据
    public static <T> RestResult<T> success(T t, ResultCode code) {
        RestResult<T> result = new RestResult<T>();
        result.setCode(code.getCode());
        result.setMsg(code.getMsg());
        result.setData(t);
        return result;
    }

    //失败，返回失败信息
    public static <T> RestResult<T> fail(ResultCode code) {
        RestResult<T> result = new RestResult<T>();
        result.setCode(code.getCode());
        result.setMsg(code.getMsg());
        return result;
    }

    /**
     * 失败，返回失败信息，带错误信息
     *
     * @param code
     * @param throwable
     * @return
     */
    public static <T> RestResult<T> fail(ResultCode code, Throwable throwable) {
        RestResult<T> result = new RestResult<T>();
        result.setCode(code.getCode());
        result.setMsg(code.getMsg());
        result.setThrowable(throwable);
        return result;
    }

    //失败，返回失败信息
    public static <T> RestResult<T> failIncludeData(T t, ResultCode code) {
        RestResult<T> result = new RestResult<T>();
        result.setCode(code.getCode());
        result.setMsg(code.getMsg());
        result.setData(t);
        return result;
    }
}
