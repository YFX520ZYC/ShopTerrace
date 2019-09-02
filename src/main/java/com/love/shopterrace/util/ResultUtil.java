package com.love.shopterrace.util;

import com.love.shopterrace.constsys.SystemConst;
import com.love.shopterrace.vo.ResultVO;

import javax.xml.crypto.Data;

public class ResultUtil {

    public static ResultVO exec(boolean istrue, String msg, Object data){
        ResultVO resultVO = new ResultVO(istrue? SystemConst.OK:SystemConst.ERROR,msg,data);
        return resultVO;
    }

    public static ResultVO setRight(){
        return exec(true,"OK", null);
    }

    public static ResultVO setError(){
        return exec(false,"ERROR", null);
    }

    public static ResultVO setOK(String msg){
        return exec(true,msg,null);
    }

    public static  ResultVO setOK(Object obj){
        return exec(true,"OK", obj);
    }
}
