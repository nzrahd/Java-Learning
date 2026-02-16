import java.util.*;
public class Arraybasic {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n;
        int[]a=new int[5];
        System.out.println("Enter Array elements:");
        n=in.nextInt();
        for (int i = 0; i < 5; i++) {
            a[i]=in.nextInt();
        }
         //Minimum in Array
        int temp=0;
        for (int i = 0; i < a.length-1; i++) {
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }

            }
            for (i = 0; i < a.length; i++) {
                System.out.println(a[i]);
                
            }
    }

}
}
