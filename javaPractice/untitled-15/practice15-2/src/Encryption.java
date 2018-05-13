import java.io.*;
public class Encryption {
    public static void main(String[] args) {
        char a[] = "这是加密文件".toCharArray();      //创建char型数组
        int n = 0;
        try {
            File out = new File("word.txt");  //创建文件对象
            for (int i = 0; i < a.length; i++) {
                a[i] = (char) (a[i] ^ 'R');             //加密运算
            }
            FileWriter fw = new FileWriter(out);        //创建FileWriter对象
            fw.write(a, 0, a.length);              //将a写入文件
            fw.close();                                 //将流关闭
            FileReader fr = new FileReader(out);         //创建FileWriter对象
            char tom[] = new char[10];                    // 创建char型数组
            System.out.println("加密后：");
            while ((n = fr.read(tom, 0, 10)) != -1) {
                String s = new String(tom, 0, n);
                System.out.println(s);
            }
            fr.close();
            fr = new FileReader(out);
            System.out.println("明文：");
            while ((n = fr.read(tom, 0, 10)) != -1) {
                for (int j = 0; j < n; j++) {
                    tom[j] = (char) (tom[j] ^ 'R');
                }
                String str = new String(tom, 0, n);
                System.out.println(str);
            }

            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
