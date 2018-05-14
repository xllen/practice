import java.io.*;
import java.net.*;
public class Tcp {
    public static void main(String[] args) throws Exception {
        new TCPclient().connect();                  ////创建TCPclient对象 ，并调用connect()方法

    }
}
class TCPclient{
    private static final int PORT = 8002;
    public void connect()throws Exception{
        //创建一个Socket并连接到给出地址和端口号的客户机
        Socket client = new Socket(InetAddress.getLocalHost(),PORT);
        InputStream is = client.getInputStream();   //输入流对象
        byte[] buf = new byte[1024];        //定义1024个字节的数组的缓冲区

        int len = is.read(buf);             //将数据读到缓冲区
        System.out.println(new String(buf,0,len));
        client.close();

    }
}
