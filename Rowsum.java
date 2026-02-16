import java.util.*;

public class Rowsum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = in.nextInt();

        System.out.print("Enter number of columns: ");
        int c = in.nextInt();

        int[][] a = new int[r][c];
        int sum=0;
        int temp=0;
        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = in.nextInt();
            }
        }
        
        for (int i = 0; i < r; i++) {
            sum=0;
            for (int j = 0; j < c; j++) {
               sum=sum+a[i][j];
               if(sum>temp){
                   temp=sum;
                }
            System.out.println("Sum:"+sum);
            }
        }
    }
}

