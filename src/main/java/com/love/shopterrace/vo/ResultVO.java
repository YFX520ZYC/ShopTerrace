package com.love.shopterrace.vo;

import lombok.Data;

@Data
public class ResultVO {

    private int code;
    private String msg;
    private Object data;

    public ResultVO(){

    }
    public ResultVO(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
