public class Main {

    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = "hello Java";
        String newStr1 = str1.substring(2,6);
        String newStr2 = str2.substring(2,5);
        boolean same = newStr1.equalsIgnoreCase(newStr2);
        if(same) {
            System.out.println("两个子串相同");
        }else {
            System.out.println("两个子串不相同");
        }
    }
}
