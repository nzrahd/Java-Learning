import java.util.*;
public class ProductArr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) 
            {
            arr[i]=in.nextInt();
            }
        int prod=1;
        for (int i = 0; i < arr.length; i++) 
            {
                for (int j = 0; j < n; j++) {
                    if(arr[i]!=arr[j]){
                    prod=prod*arr[i];
                }
                else{
                    continue;
                }
                
                }
            }
        System.out.println("Product of Array elements:"+prod);
    }
    
}
