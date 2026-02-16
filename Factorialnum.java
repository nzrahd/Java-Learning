import java.util.*;
public class Factorialnum {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter num:");
        int n=in.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial:"+fact);


    }
}
