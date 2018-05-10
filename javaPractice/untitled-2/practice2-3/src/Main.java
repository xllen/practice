public class Main {

    public static void main(String[] args) {
        byte aa = 111;                           //声明byte型变量并赋值
        short bb = 1234;                         //声明shot型变量并赋值
        long cc = 500;                            //声明long型变量并赋值
        int dd = 100;                             //声明int型变量并赋值
        System.out.println("byte型与int型数据进行运算：" + (aa+dd));
        System.out.println("short型与int型数据进行运算：" + (bb*dd));
        System.out.println("long型与int型数据进行运算：" + (cc/dd));
    }
}
