import java.io.*;
import java.util.Scanner;

public class FileText {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入文件名");
        String textName = input.next();
        File file = new File(textName);   //创建文件对象
        try {
            FileOutputStream out = new FileOutputStream(file);      //创建FileOutputStream写入对象
            System.out.println("请输入文件内容");
            String textContent = input.next();
            byte book[] = textContent.getBytes();                   //创建byte型数组
            out.write(book);                                        //将输入的信息写入文件中
            out.close();                                            //关闭流
            System.out.println("文件已被创建");
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            FileInputStream in = new FileInputStream(file);         //创建FileOutputStream写入对象
            byte book2[] = new byte[1024];                          //创建byte型数组
            int len = in.read(book2);                               //从文件读取信息
            System.out.println("文件中的信息是："+new String(book2,0,len));
            in.close();                                             //关闭流
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
