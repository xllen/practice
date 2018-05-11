public class Main {

    public static void main(String[] args) {
        String text = "18627229512";
        //以13,15,18,17开头的11位号码
        String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
        if(text.matches(regExp)) {
            System.out.println("text是一个合法的电话号码！");
        }else {
            System.out.println("text不是一个合法的电话号码！");
        }
    }
}
