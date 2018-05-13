package com.xielei;

import java.util.*;

public class Gather {
    public static void main(String[] args){
        Set<String> list1 = new HashSet<>();
        list1.add("A");
        list1.add("a");
        list1.add("C");
        list1.add("c");
        if(list1.add("a")){
            System.out.println("Set 添加成功");
        }else {
            System.out.println("Set 添加失败");
        }
        System.out.println("Set集合中的元素：");
        for(String j:list1)
        {
            System.out.println(j);
        }
        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("a");
        list2.add("C");
        list2.add("c");
        if(list2.add("a")){
            System.out.println("List 添加成功");
        }else {
            System.out.println("List 添加失败");
        }
        System.out.println("List集合中的元素：");
        for(String x:list2)
        {
            System.out.println(x);
        }
    }
}
