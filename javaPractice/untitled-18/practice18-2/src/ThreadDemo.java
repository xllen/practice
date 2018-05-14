public class ThreadDemo{
    int x = 3;
    int y = 2;
    public synchronized void addNum() {         //定义加的同步方法
        System.out.println(x+y);
    }
    class T1 implements Runnable{               //定义内部类T1实现Runnable接口，使其有使用线程的功能
        public void run(){                      //在内部类中重写run方法
            addNum();
        }
    }
    public synchronized void reduceNum() {      //定义减的同步方法
        System.out.println(x-y);
    }
    class T2 implements Runnable{
        public void run(){
            reduceNum();
        }
    }

    public static void main(String[] args){
        ThreadDemo t = new ThreadDemo();    //实例化外部类
        T1 t1 = t.new T1();                 //实例化内部类
        T2 t2 = t.new T2();
        Thread thread1 = new Thread(t1);    //实例线程对象
        Thread thread11 = new Thread(t1);
        thread1.start();                    //启动线程
        thread11.start();
        Thread thread2 = new Thread(t2);
        Thread thread22 = new Thread(t2);
        thread2.start();
        thread22.start();
    }
}
