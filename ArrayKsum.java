import java.util.*;
public class ArrayKsum
 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int n=in.nextInt();
        int [] fib=new int[n];
        System.out.println("Enter Array Element");
        for (int i = 0; i < n; i++) 
            {
            fib[i]=in.nextInt();
            }
        System.out.print("Enter K Value:");
        int k=in.nextInt();
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += fib[j];

                if (sum == k) {
                    int len = j - i + 1;
                    if (len > maxLen) {
                        maxLen = len;
                    }
                }
            }
        }

        System.out.println("Length of subarray: " + maxLen);
 }
    
}
