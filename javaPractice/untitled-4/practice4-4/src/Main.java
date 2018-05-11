public class Main {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(""); //创建字符串生成器
        for(int n = 1; n<= 10;n++){
            str.append(n);
        }
        System.out.println(str);
    }
}
