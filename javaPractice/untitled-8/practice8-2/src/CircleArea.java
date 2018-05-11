import java.util.Scanner;

public class CircleArea {
    public double GetCircleArea(double r){
        return Math.PI*r*r;
    }
    public static void main(String[] args){
        CircleArea t = new CircleArea();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入半径：");
        String str = scanner.nextLine();
        double r = Double.parseDouble(str);    // 将输入的半径转为double类型
        double area = t.GetCircleArea(r);
        System.out.print("圆的面积为："+String.format("%.5f", area));
    }
}
