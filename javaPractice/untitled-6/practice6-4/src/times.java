public class times {
    public void arr_input(int[] arr){           //定义打印次数方法
        int i = 666;
        for(int j = 1; j <= arr.length;j++){
            System.out.println("第"+j+"次打印"+ i);
        }
    }
    public static void main(String[] args){
        times time = new times();               //创建一个times类对象
        int[] arr = {1,2,3,4};                  //定义一个数组
        time.arr_input(arr);                    //time对象调用arr_input方法并传参
    }
}
