import java.util.*;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
       if(sc.hasNextLine()){
         int num = sc.nextInt();
         if(num%2==0){
            System.out.println("Entered number is even");
         }
         else
         System.out.println("Entered number is odd");

       }
       else 
       System.out.println("Entered number is invalid please provide whole number");
    }
    
}
