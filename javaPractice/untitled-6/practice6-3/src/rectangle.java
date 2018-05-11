public class rectangle {
    private int length;     //定义成员变量length
    private int width;      //定义成员变量width
    public rectangle(int length,int width){     //定义构造方法
        this.length = length;                   //将参数length值赋予给成员变量length
        this.width = width;                     //将参数width值赋予给成员变量width
    }
    public int getArea(){                       //定义求举行面积的方法
        return this.length * this.width;
    }

    public static void  main(String args[]){    //定义主方法
        rectangle react = new rectangle(5,7);
        System.out.print("矩形的面积是："+ react.getArea());
    }
}
