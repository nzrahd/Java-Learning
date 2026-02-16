import java.util.*;

public class duplicateelementArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Array Size:");
        int n = in.nextInt();

        int[] num = new int[n];
        boolean[] v = new boolean[n];

        System.out.println("Enter Array elements:");
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }

        System.out.println("Duplicate elements:");
        for (int i = 0; i < n - 1; i++) {
            if (v[i])
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (num[i] == num[j]) {
                    count++;
                    v[j] = true;
                }
            }

            if (count > 1) {
                System.out.println(num[i] + " occurs " + count + " times");
            }
        }
    }
}
