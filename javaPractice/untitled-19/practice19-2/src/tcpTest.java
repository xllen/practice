import java.io.*;
import java.net.*;
import java.util.Scanner;

public class tcpTest {
    public static void main(String[] args) throws Exception {
        new TCPserver().listen();           //创建TCPserver对象 ，并调用listen()方法
    }
}
class TCPserver{
    public void listen()throws Exception{   //定义一个listen()方法，抛出异常
        Scanner input=new Scanner(System.in);
        String text = input.next();
        ServerSocket serverSocket = new ServerSocket(8001);    // 创建ServerSocket对象，并指定端口
        Socket client = serverSocket.accept();  //调用ServerSocket的accept（）方法接收数据
        OutputStream os = client.getOutputStream();     //创建输出流对象
        os.write((text).getBytes());            //将输入的文本存到byte数组，并写入到输出流中
        Thread.sleep(5000);              //线程休眠5000ms
        System.out.println("交互结束");
        os.close();                             //关闭流
        client.close();                         //关闭服务器套接字
    }
}

