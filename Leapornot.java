import java.util.Scanner;
public class Leapornot {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter A year:");
    int yr=in.nextInt();
    if(yr%4==0)
        System.out.println("Leap Year");
    else
        System.out.println("Not Leap Year");
    }
    
}
