package com.xielei;

import java.util.*;
public class Muster {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();  //创建集合对象
        for(int i = 1; i <= 100;i++){
            list.add(i);
        }
        System.out.println("移除的数字是:"+list.remove(10));
    }
}
