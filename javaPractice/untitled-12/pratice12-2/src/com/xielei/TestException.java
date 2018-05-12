package com.xielei;

public class TestException {
    public static void main(String[] args){
        try{
            new Number().count(3,0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class Number{
    public int count(int x,int y) throws Exception{
        int result = x/y;
        return result;
    }
}
