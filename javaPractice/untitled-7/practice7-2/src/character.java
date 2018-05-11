public class character {
    public static void  main(String[] args){
        Character mychar1 = new Character('s');
        Character mychar2 = new Character('S');
        if(mychar1.equals(mychar2)){
            System.out.println("mychar1和mychar2相同");
        }else {
            System.out.println("mychar1和mychar2不相同");
        }
        //Character.toLowerCase方法将大写转化为小写
        if(mychar1.equals(Character.toLowerCase(mychar2))){
            System.out.println("mychar1和mychar2相同");
        }else {
            System.out.println("mychar1和mychar2不相同");
        }
    }
}
