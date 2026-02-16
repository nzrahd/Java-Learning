import java.util.*;
public class BillGenerator {
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int pizza=100;
        int puffs=20;
        int cooldrinks=10;
        System.out.println("Enter Pizza buyed");
        int pz=in.nextInt();
        System.out.println("Enter puffs buyed");
        int pf=in.nextInt();
        System.out.println("Enter cooldrinks buyed");
        int cd=in.nextInt();
        int total=(pizza*pz)+(puffs*pf)+(cooldrinks*cd);
        System.out.println("Bill Details:");
        System.out.println("Pizza: "+pizza*pz);
        System.out.println("Puffs: "+puffs*pf);
        System.out.println("Cooldrinks: "+cooldrinks*cd);
        System.out.println("Total Bill: "+total);
        
    }
    
}
