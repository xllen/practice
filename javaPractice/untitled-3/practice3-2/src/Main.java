public class Main {

    public static void main(String[] args) {
        //上半部分
        for(int m = 1;m <= 10;m++){
            //输出空格
            for(int n = 9;n >= m;n--){
                System.out.print(" ");  //print()输出不换行
            }
            //输出* 左上
            for(int n = 1;n <= m;n++){
                System.out.print("*");
            }
            //输出* 右上
            for(int n = 1;n < m;n++){
                System.out.print("*");
            }
            System.out.println();     //println()输出自动换行
        }
        //下半部分
        for(int m = 1;m <= 9;m++){
            //输出空格
            for(int n = 1;n <= m;n++){
                System.out.print(" ");
            }
            //输出* 左下
            for(int n = 9;n >= m;n--){
                System.out.print("*");
            }
            //输出* 右下
            for(int n = 9;n > m;n--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
