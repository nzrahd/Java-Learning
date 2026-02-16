import java.util.*;
class Sumofdigits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Value:");
        int vl=in.nextInt();
        {
            int sum=0;
            while(vl!=0){
                int rem=vl%10;
                sum=sum+rem;
                vl=vl/10;
                
            }
           System.out.println("Total:"+sum);
        }
    }
    
}


    

