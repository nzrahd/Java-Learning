 import java.util.*;
 public class ArraySwap2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Matrix Dimension: ");
        int d=in.nextInt();
        int[][]a=new int[d][d];

        System.out.println("Enter Elements:");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                a[i][j]=in.nextInt();
            }
        }
        for (int j = 0; j < d; j++) {
            int temp=a[0][j];
            a[0][j]=a[d-1][j];
            a[d-1][j]=temp;
            
        }
        for(int i=0;i<d;i++){
            for(int j=0;j<d;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
