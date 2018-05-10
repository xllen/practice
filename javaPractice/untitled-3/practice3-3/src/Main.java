public class Main {

    public static void main(String[] args) {
        double x = 1;
        double y = 1;
        double z = 0;
        double sum = 0;
        while( x <= 20){
            y = y * x;
            z = 1 / y;
            sum = sum + z;
            x++;
        }
        System.out.println("sum="+ sum);
    }
}
