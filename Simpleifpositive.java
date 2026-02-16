import java.util.Scanner;
public class Simpleifpositive {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = in.nextInt();
        if(num > 0) {
            System.out.println("The number is positive.");
        }
    }
    
}
