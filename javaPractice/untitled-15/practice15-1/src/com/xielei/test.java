package com.xielei;

import java.io.*;

import javax.swing.*;
public class test {
    public static void main(String[] args){
        byte b[] = new byte[30];
        try{
            FileInputStream fis = new FileInputStream("practice15-1.iml");
            ProgressMonitorInputStream in =
                    new ProgressMonitorInputStream(null,"读取文件",fis);
            while(in.read(b)!=-1){
                String s = new String(b);
                System.out.print(s);
                Thread.sleep(1000);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
