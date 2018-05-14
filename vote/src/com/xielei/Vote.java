package com.xielei;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Vote {
        public static void main(String[] args){
            Person people1=new Person("张三", "1");        //调用构造方法创建对象
            Person people2=new Person("李四", "2");
            Person people3=new Person("王五", "3");
            Person people4=new Person("刘六", "4");
            Object num[]={people1,people2,people3,people4};//将对象放入数组中
            System.out.println("候选人名单");
            System.out.println("=================================");
            for(int i=0;i<num.length;i++){
                Person person = (Person)num[i];
                System.out.println("姓名："+person.getName()+"，编号："+person.getNumber());
            }
            System.out.println("=================================");
            Scanner input=new Scanner(System.in);
            String t;
            String str = "[a-zA-Z]";
            System.out.println("请输入侯选人代号进行投票（输入0结束）");
            while(true){
                t=input.next();
                try{
                    if(t.matches(str)){
                        throw new MyException("输入不合法，");
                    }else if(Integer.parseInt(t)> 4 || Integer.parseInt(t)<0){
                        throw new MyException("输入有误，");
                    }
                    else if(Integer.parseInt(t) == 0){
                        break;
                    }else {
                        int polls=((Person)num[Integer.parseInt(t)-1]).getPoll();
                        ((Person)num[Integer.parseInt(t)-1]).setPoll(polls+1);
                    }
                }catch (MyException e){
                    System.out.print(e.getMessage());
                }
                System.out.println("请继续投票");
            }
            System.out.println("投票结束，各候选人的得票结果如下：");
            System.out.println("=================================");
            Arrays.sort(num);//对数组进行排序
            for(int i=0;i<num.length;i++){
                Person person= (Person)num[i];
                System.out.println("姓名："+person.getName()+"，编号："+person.getNumber()+",票数：【"+person.getPoll()+"】");
            }
            System.out.println("=================================");
            Person p=((Person)num[num.length-1]);//获取最大的人
            String resuleText = "投票的最终结果是："+p.getName()+"同学，最后以"+p.getPoll()+"票当选班长";
            System.out.println(resuleText);
            File file = new File("result.txt");
            try {
                FileOutputStream out = new FileOutputStream(file);      //创建FileOutputStream写入对象
                byte book[] = resuleText.getBytes();                   //创建byte型数组
                out.write(book);                                        //将输入的信息写入文件中
                out.close();                                            //关闭流
                System.out.println("最终结果已被写入到result.txt文本文档中");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    class Person implements Comparable<Person>{  //Person类实现了Comparable接口，所以它能被排序
        private String name;
        private String number;
        private int poll;
        public Person(String name,String number){  //构造方法
            this.name=name;
            this.number=number;
            this.poll=0;
        }
        //重写compareTo方法
        public int compareTo(Person p) {//java内置的排序对象，可以进行从小到大的排序
            return this.poll-p.poll;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getNumber() {
            return number;
        }
        public void setNumber(String number) {
            this.number = number;
        }
        public int getPoll() {
            return poll;
        }
        public void setPoll(int number) {
            this.poll = number;
        }
    }

