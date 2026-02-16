import java.util.*;
public class RowSum2D{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int Sum=0;
        System.out.print("Enter Rows:");
        int r=in.nextInt();
        System.out.print("Enter Column:");
        int c=in.nextInt();
        int[][] a=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j]=in.nextInt();
                }
        }
        System.out.print("2D Array:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                Sum=Sum+a[i][j];
                
            }
        System.out.print(Sum+" ");
        System.out.println();
    }
}
}
