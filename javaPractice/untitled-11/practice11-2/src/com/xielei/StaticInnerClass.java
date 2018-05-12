package com.xielei;

public class StaticInnerClass {
    int x =100;
    static class Inner{  //静态内部类
        void doitInner(){
            //System.out.print("调用" + x); //不能调用外部类的成员变量x
         }
        public static void main(String args[]){
            System.out.println("a");
         }
    }
}
