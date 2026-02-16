import java.util.*;
class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=in.nextInt();
        int fv=0,sv=1;
        System.out.println("Fibonacci Series is");
        System.out.println(fv+" "+sv+" ");
        for(int i=0;i<=n;++i){
            System.out.println(" "+fv);
            int nv=fv+sv;
            fv=sv;
            sv=nv;

        }
    }
    
}
