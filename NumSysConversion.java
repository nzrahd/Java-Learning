import java.util.*;
public class NumSysConversion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter num:");
        int dec=in.nextInt();
        String hex="";
        int rem=0;
        while(dec>0){
            rem=dec%8;
            if(rem<10)
                hex=rem+hex;

            else if(rem>=10){
                rem=(rem-10)+'A';
                hex=(char)rem+hex;
            }
            dec=dec/8;
        }
        System.out.println(hex+"");
    }
    
}
