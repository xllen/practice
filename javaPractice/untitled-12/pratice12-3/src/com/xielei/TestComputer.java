package com.xielei;

import java.util.Scanner;

public class TestComputer {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        System.out.println("---------请输入两个数字:------");
        Scanner cin=new Scanner(System.in);
        int x=cin.nextInt();
        int y=cin.nextInt();
        Computer Cop=new Computer();
        try {
            Cop.CheckNumber(x, y);
        } catch (MyException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
class Computer {
    //定义方法，抛出异常
    public static void CheckNumber(int m, int n) throws MyException {
        if (m < 0 || n < 0) {
            throw new MyException("您传入要计算最大公约数的数字不合法,请仔细检查!");
        } else {
            while (m % n != 0) {
                int temp = m % n;
                m = n;
                n = temp;
            }
        }
        System.err.println("计算的两个数的最大公约数为:" + n);
    }
}
