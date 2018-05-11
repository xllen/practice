import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int arr1[] = new int[]{11,22,33,44,55,66};
        int arr2[] = Arrays.copyOfRange(arr1,0,3);
        for(int i = 0; i < arr1.length;i++){
            System.out.println("arr1中的元素有："+ arr1[i]);
        }
        for(int j = 0; j < arr2.length;j++){
            System.out.println("arr2中的元素有："+ arr2[j]);
        }
    }
}
