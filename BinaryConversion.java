import java.util.*;
public class BinaryConversion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter num:");
        int dec=in.nextInt();
        String bin="";
        int rem=0;
        while(dec>0){
            rem=dec%8;
            bin=rem+bin;
            dec=dec/8;
        }
        System.out.println(bin+"");


    }
    
}
