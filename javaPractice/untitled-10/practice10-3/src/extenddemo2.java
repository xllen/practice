public class extenddemo2 {
    public extenddemo2(){  //父类的构造方法
        System.out.println("这是父类的构造方法");
    }
    public int height; //成员变量
    public void book(){     //成员方法
        System.out.println("这本书没看点！");
    }
}
class demo2 extends extenddemo2 {
    public demo2(){         //子类的构造方法
        System.out.println("这是子类的构造方法");
    }
    public int weight = 4;
    public void book2(){
        System.out.println("这本书比上一本好看！");
    }
    public static void main(String[] args){
        demo2 d2 = new demo2();
        System.out.println(d2.weight);
    }
}