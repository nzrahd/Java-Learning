import java.util.*;
public class MultiDimArr {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Rows:");
        int n=in.nextInt();
        System.out.print("Enter Column:");
        int c=in.nextInt();
        int[][] a=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=in.nextInt();
                }
        }
        System.out.print("3D Array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(a[i][j]+" ");
            }
            
        System.out.println();
        }
    }
}
