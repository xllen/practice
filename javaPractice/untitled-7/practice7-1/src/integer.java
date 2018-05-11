public class integer {
    public static void main(String[] args){
        Integer number = new Integer(7);
        Integer string = new Integer("45");         //以string型变量作为参数来创建Integer对象
        System.out.println(number.intValue());          //intValue方法，以int型返回此Integer对象
        System.out.print(string.intValue());
    }
}
