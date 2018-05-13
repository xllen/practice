import java.io.*;

public class done {
    static final int lineLength = 81;
    public static void main(String[] args){
        FileOutputStream fos;
        byte[] name = new byte[lineLength];
        byte[] pw = new byte[lineLength];
        try {
            fos = new FileOutputStream("word.txt");
            while (true){
                System.out.println("请输入姓名");
                if ("done".equalsIgnoreCase(new String(name,0,0,4))){
                    System.out.println("录入完毕");
                    break;
                }
                System.out.println("请输入密码");
                readLine(pw);
                for (int i = 0; pw[i] != 0; i++) {
                    fos.write(pw[i]);
                }
                readLine(name);
                fos.write(',');
                for (int j = 0; name[j] != 0; j++) {
                    fos.write(name[j]);
                }
                fos.write('\n');
                System.out.println("信息已经写入文件");
            }
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // readLine(byte[] name) 方法将键盘输入凑成一个字节数组，
    // 当遇到回车时将字节数组的最后一个字节取0，
    // 分别在 for (int i = 0; phone[i] != 0; i++)和for (int j = 0; name[j] != 0; j++) 循环中用到，
    // 相等于判断"字符串"的结束符。
    private static void readLine(byte[] name) throws IOException {
        int b = 0, i = 0;
        while ((i < (lineLength - 1)) && (b = System.in.read()) != '\n') {
            name[i++] = (byte) b;
        }
        name[i] = (byte) 0;
    }
}
