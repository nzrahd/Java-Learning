import java.util.*;
public class Switchcase {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your Choice:");
        String nm=in.next();
        switch (nm) {
            case "Mon" :
                System.out.println("Monday");
                
                break;
            case "Tue":
                System.out.println("Tuesday");
                break;
            case "wed":
                System.out.println("Wednesday");
                break;
            case "thu":
                System.out.println("Thursday");
                break;
            case "fri":
                System.out.println("Friday");
                break;
            case "sat":
                System.out.println("Saturday");
                break;
            case "sun":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invaild Input");;
        }
    }
    
}
