public class Main {

    public static void main(String[] args) {
        int[][] number = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] newnumber = new int[number[0].length][number.length];
        for(int i = 0;i<number.length;i++){
            for(int j = 0;j<number[i].length;j++){
                newnumber[i][j] = number[j][i];
            }
        }
        System.out.println("This is new Array");
        for(int i = 0;i<number.length;i++){
            for(int j = 0;j<number[i].length;j++){
                System.out.print(newnumber[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("This is old Array");
        for(int i = 0;i<number.length;i++){
            for(int j = 0;j<number[i].length;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
