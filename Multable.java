import java.util.*;
public class Multable {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Table:");
        int tb=in.nextInt();
        for(int i=1;i<10;i++){
            System.out.println(i+"*"+"tb"+"="+ i*in);
        }
    }
    
}
