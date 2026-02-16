import java.util.*;
public class RotationCheck
 {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int n=in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Enter First Array Elements:");
        for (int i = 0; i < n; i++) 
            {
                a[i]=in.nextInt();
            }
        System.out.println("Enter Second Array Elements:");
        for (int i = 0; i < n; i++) 
            {
                b[i]=in.nextInt();
            }
        boolean flag = false;

        for (int i = 0; i < n; i++) 
            {
            if (a[i] == b[0]) {
                int j;
                for (j = 0; j < n; j++)
                     {
                        if (a[(i + j) % n] != b[j])
                            {
                                break;
                            }
                        }
                        if (j == n) {
                            flag = true;
                            break;
                        }
                    }
                }
                if (flag)
                    System.out.println("Rotation");
                else
                    System.out.println("Not Rotation");
        }
    }