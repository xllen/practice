public class extenddemo {
    public void book(){
       System.out.println("书很好看");
    }
    public void music(){
        System.out.println("音乐很好听");
    }
}
class sondemo extends extenddemo {  //子类sondemo继承父类extenddemo
    public void music(){
        System.out.println("在子类中重载了music方法");
    }
    public static void main(String[] args) {
        extenddemo d1 = new sondemo(); //向上转型
        d1.music();
        d1.book();
    }
}
