import java.util.*;
public class Speedlimit{
public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter Speed:");
    int spd=in.nextInt();
    if(spd<=60)
            System.out.println("No Fine");
        else if(spd>60 && spd<80)
            System.out.println("500 Fine");
        else if(spd>81 && spd<100)
            System.out.println("2000 Fine");
        else if(spd>101 && spd<120)
            System.out.println("5000 Fine");
        else
            System.out.println("License Suspended");

}
    
}
