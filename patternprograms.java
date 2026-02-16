/*import java.util.*;
public class patternprograms {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n=in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            int num=1;
            for(int j=1;j<=i;j++){
                System.out.print(9+"");

            }
            System.out.print(" "); 
        }

    }
    
}*/
import java.util.*;
public class patternprograms {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n=in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            int num=1;
            for(int j=1;j<=i;j++){
                num=num*10;
                num=num+9;

            }
            sum=sum+num;
            
        }
        System.out.print(sum); 
    }
}

