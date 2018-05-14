public class ThreadTest extends Thread{     //继承Thread类
    private String p = "you are good";
    public void run(){                      //重写run方法
        while (true) {
            try {
                Thread.sleep(100);   //使线程休眠100ms
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(p);
        }
    }
    public static void main(String[] args){
        new ThreadTest().start();           //调用start方法
    }
}
