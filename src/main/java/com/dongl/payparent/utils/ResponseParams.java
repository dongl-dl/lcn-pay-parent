package com.dongl.payparent.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author D-L
 * @version 1.0.0
 * @ClassName ResponseParams.java
 * @Description TODO
 * @createTime 2021-09-16 11:22:00
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseParams<T> implements Serializable {

    private static final long serialVersionUID = -7173074737108454L;
    //状态（0或1）
    private String status = "0";

    // 错误码
    private String code = "0x00000000";

    //描述信息（成功或失败原因）
    private String message = "";

    //接口名
    private String remark = "";

    private T data;

    public  ResponseParams success(){
        this.status = "1";
        this.message = "【调用成功】";
        this.code = "0x00000000";
        return this;
    }

    public  ResponseParams success(String code , T data){
        this.status = "1";
        this.message ="【调用成功】";
        this.code = code;
        this.data = data;
        return this;
    }
    public  ResponseParams success( T data){
        this.status = "1";
        this.message ="【调用成功】";
        this.code = "200";
        this.data = data;
        return this;
    }

    public  ResponseParams success(String code ,String message , T data){
        this.status = "1";
        this.message = message;
        this.code = code;
        this.data = data;
        return this;
    }

    public  ResponseParams error(){
        this.status = "0";
        this.message = "【调用失败】";
        this.code = "500";
        return this;
    }

    public  ResponseParams error(String code){
        this.status = "0";
        this.message = "【调用失败】";
        this.code = code;
        return this;
    }

    public  ResponseParams error(String code ,String message){
        this.status = "0";
        this.message = message;
        this.code = code;
        return this;
    }

    public ResponseParams(String remark) {
        this.remark = remark;
    }
    public ResponseParams(T data) {
        this.data = data;
    }
}

