import java.util.*;
public class Leaders 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) 
            {
            arr[i]=in.nextInt();
            }
        for (int i = 0; i < arr.length; i++) 
            {
            boolean leader = true;

            for (int j = i + 1; j < arr.length; j++)
                 {
                if (arr[i] <= arr[j]) {
                    leader = false;
                    break;
                }
            }

            if (leader) {
                System.out.print("All Leaders:"+arr[i] + " ");
            }
        }
    }
}
