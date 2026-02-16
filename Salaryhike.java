import java.util.*;
public class Salaryhike {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your performance:");
        int per=in.nextInt();
        if(per>=90)
            System.out.println("15% Hike");
        else if(per>=80)
            System.out.println("12% Hike");
        else if(per>=70)
            System.out.println("8% Hike");
        else if(per>=60)
            System.out.println("5% Hike");
        else
            System.out.println("No Hike");

    }
    
}
