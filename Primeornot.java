import java.util.*;
public class Primeornot {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter num:");
        int n=in.nextInt();
        System.out.println("Prime numbers are:");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        
        
    }
    
}
