import java.util.*;
public class Electricbill {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Unit:");
        int unt=in.nextInt();
        if(unt<=100)
            System.out.println("One Unit one rupees");
        else if(unt>100 && unt<201)
            System.out.println("One Unit Two rupees");
        else if(unt>200 && unt<301)
            System.out.println("One Unit Three rupees");
        else
            System.out.println("One Unit Five rupees");
    }

}
