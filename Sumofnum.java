import java.util.*;
class Sumofnum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Value:");
        int vl=in.nextInt();
        {
            int sum=0;
            while(vl!=0){
                vl=vl/10;
                sum++;
            }
           System.out.println("No.of.Digits:"+sum);
        }
    }
    
}


    

