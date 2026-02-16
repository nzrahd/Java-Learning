import java.util.Scanner;
class Simpleifelseamount {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Amount");
        int amt=in.nextInt();
        if(amt>10000)
            System.out.println("550 Debited");
        else
            System.out.println("50 Debited");
    }
}
