package com.xielei;

//创建自定义异常类
public class MyException extends Exception{
    private  String message;
    public MyException(String message){
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
}
