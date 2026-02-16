import java.util.*;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = in.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("Enter first array:");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        System.out.println("Enter second array:");
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        boolean isRotation = true;
        int count=0;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (a[i]==b[j])
                     {
                    count++;
                }
            }
        if (count== n) {
            System.out.println("Array is rotation of another array");
        }else {
            System.out.println("Array is not rotation of another array");
            }
        }
    }

}
