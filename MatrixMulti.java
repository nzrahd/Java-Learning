import java.util.*;
public class MatrixMulti {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Rows:");
        int n=in.nextInt();
        System.out.print("Enter Column:");
        int c=in.nextInt();
        int[][] a=new int[n][n];
        int[][] b=new int[n][n];
        int[][] m=new int[n][n];
        System.out.println("Enter ELements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=in.nextInt();
                }
        }
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j]=in.nextInt();
                }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    m[i][j] += a[i][k] * b[k][j];

                    }
                }
            }
        System.out.println("Product:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" "+m[i][j]);
                }
        System.out.println();
        }
    }
}

