import java.util.Scanner;
public class ArrayEleSearch {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] num;
        System.out.println("Enter Array Size:");
        int n=in.nextInt();
        num=new int[n];
        int key;
        int flag=1;
        System.out.println("Enter Array elements:");
        for (int i = 0; i < n; i++) {
            num[i]=in.nextInt();
        }
        System.out.print("Enter element to Search:");
        key=in.nextInt();
        for (int i = 0; i < n; i++) {
            if(num[i]== key){
                System.out.println("Element found At Index:"+i);
                flag=0;
                break;
            }
        if(flag==1)
            System.out.println("Element not Found");
            
        }
        }


    }
    

