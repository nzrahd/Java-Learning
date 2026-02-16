import java.util.*;

public class ArrayLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = in.nextInt();

        System.out.print("Enter number of columns: ");
        int c = in.nextInt();

        int[][] a = new int[r][c];
        
        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("Transposed 2D Array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(""+a[j][i]);
                
                }
            System.out.println();
            }
        }
    }


