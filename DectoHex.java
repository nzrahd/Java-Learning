import java.util.*;
public class DectoHex {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Decimal Number:");
        int dec=in.nextInt();
        String hex="";
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(dec>0)        {
            int rem=dec%16;
            hex=hexchars[rem]+hex;
            dec=dec/16;
        }
        System.out.println("Hexadecimal Number:"+hex);
    }
}
