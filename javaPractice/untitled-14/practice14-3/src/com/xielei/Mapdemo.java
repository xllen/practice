package com.xielei;

import java.util.*;

public class Mapdemo {
    public static void main(String[] args){
        Map<String,String> map=new HashMap();           //由HsahMap实现的Map对象
        Emp emp=new Emp("014","张三");   //创建Emp对象
        Emp emp1=new Emp("015","李四");
        Emp emp2=new Emp("016","王五");
        Emp emp3=new Emp("017","赵六");
        map.put(emp.getE_id(), emp.getE_name());        //向集合中添加对象
        map.put(emp1.getE_id(), emp1.getE_name());
        map.put(emp2.getE_id(), emp2.getE_name());
        map.put(emp3.getE_id(), emp3.getE_name());
        Set<String> keys=map.keySet();                  //获取Map集合中所有key对象的集合
        System.out.println("遍历集合map：");
        Iterator<String> it=keys.iterator();            //创建集合迭代器
        while(it.hasNext())                             //遍历集合
        {
            String key=it.next();
            System.out.println(key+" "+map.get(key));
        }
        System.out.println("移除的是"+map.remove("015"));
        Map<String,String>treemap=new TreeMap();        //创建TreeMap集合对象
        treemap.putAll(map);                            //向集合中添加对象
        Set set=treemap.keySet();
        System.out.println("遍历集合treemap：");
        Iterator<String> ss=set.iterator();
        while(ss.hasNext())
        {
            String str=ss.next();
            System.out.println(str+" "+treemap.get(str));

        }
    }
}
