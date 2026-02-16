import java.util.*;
public class MDArrayAddition {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Rows:");
        int r=in.nextInt();
        System.out.print("Enter Column:");
        int c=in.nextInt();
        int[][] a=new int[r][c];
        int sum=0;
        System.out.println("Enter Elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j]=in.nextInt();
                }
        }
        System.out.println("Sum of 2D Array elements:"+sum);
    }
    
}
