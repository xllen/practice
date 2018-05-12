package com.xielei;

public class StaticInnerClass {
    int x =100;
    static class Inner{
        void doitInner(){
          }
        public static void main(String args[]){
            StaticInnerClass stin=new StaticInnerClass();  //创建内部类实例
            StaticInnerClass.Inner inn=new StaticInnerClass.Inner();
            System.out.println("a");
        }
    }
}
