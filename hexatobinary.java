import java.util.*;
public class hexatobinary {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a HexaDecimal Num:");
        String hexa=in.next();
        /*int value=0;
        int num=0;
        for (int i = 0; i < hexa.length(); i++) {
            value=hexa.charAt(i);
            if(value<10)
                num=value;
            else
                num=(value-'A')+10;
            while(num>0){
                int rem=num%2;
                System.out.print(rem);
                num=num/2;
            }
            System.out.print(" ");*/
            String binary="";
            for (int i = 0; i < hexa.length(); i++) {
                switch(hexa.charAt(i)){
                    case '0':
                        binary=binary+0000;
                        break;
                    case '1':
                        binary=binary+0001;
                        break; 
                    case '2':
                        binary=binary+0010;
                        break;  
                    case '3':
                        binary=binary+0011;
                        break;
                    case '4':
                        binary=binary+0100;
                        break;
                    case '5':
                        binary=binary+0101;
                        break;
                    case '6':
                        binary=binary+0110;
                        break;
                    case '7':
                        binary=binary+0111;
                        break;
                    case '8':
                        binary=binary+1000;
                        break;
                    case '9':
                        binary=binary+1001;
                        break;
                    case 'A':
                    case 'a':
                        binary+=1010;
                        break;
                    case 'B':
                    case 'b':
                        binary+=1011;
                        break;
                    case 'C':
                    case 'c':
                        binary+=1100;
                        break;
                    case 'D':
                    case 'd':
                        binary+=1101;
                        break;
                    case 'E':
                    case 'e':
                        binary+=1110;
                        break;
                    case 'F':
                    case 'f':
                        binary+=1111;
                        break;
                    System.out.println(binary+"");


                }
                System.out.println("Converted Binary is:"+binary);
            }

            
        }

    }

    

