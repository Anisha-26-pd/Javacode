import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number range of fibonnaci series: ");
        int n =sc.nextInt();
        int a =0,b=1;
        System.out.print("fibonacci series is :"+ a + " "+ b);
        for(int i= 2; i<n;i++){
           int c = a+b;
           System.out.print(" "+ c);
            a=b;
            b=c;
        }
    }
    
}
