import java.util.*;
public class breakcontinuereturn {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter num:");
        int n=in.nextInt();
        for (int i = 0; i <=n; i++) {
            if(i==7)
                return;
            else
                System.out.println(i);
            
        }
    }
    
}
