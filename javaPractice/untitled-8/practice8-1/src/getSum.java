public class getSum {
    public static void  main(String[] args){
        int num1 = 2;
        int num2 = 32;
        int sum = 0;
        for(int i = 1;i <= 6;i++){
            int s = (int)num1 + (int)(Math.random()*(num2-num1));
            if(s%2 == 0 && s!=32){
                System.out.println("第"+i+"次生成的随机数"+ s);
                sum =sum + s;
            }else {
                s = s+1;
                sum = sum +s;
                System.out.println("第"+i+"次生成的随机数"+ s);
            }
        }
        System.out.println("总和为"+ sum);
    }
}
