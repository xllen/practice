import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String arr1[] = new String[]{"aa","ee","cc","dd","ff"};
        System.out.println("未替换前的数组元素：");
        for(int i = 0;i < arr1.length;i++) {
            System.out.println(arr1[i]);
        }
        Arrays.fill(arr1,2,3,"bb");
        System.out.println("替换后的数组元素：");
        for(int j = 0;j < arr1.length;j++) {
            System.out.println(arr1[j]);
        }
    }
}
