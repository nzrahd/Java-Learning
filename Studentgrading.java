import java.util.*;
public class Studentgrading {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your Mark:");
        int mrk=in.nextInt();
        System.out.println("Enter Your Attendence");
        float atd=in.nextFloat();
        if(mrk>=85 && atd>=90)
            System.out.println("Distinction");
        else if(mrk>=70 && atd>=80)
            System.out.println("First Class");
        else if(mrk>=60 && atd>=75)
            System.out.println("Second Class");
        else if(mrk>=50 && atd>=75)
            System.out.println("pass");
        else
            System.out.println("Fail");
        
    }
    
}
