import java.util.Scanner;
public class factorial {
    
    public static void main(String [] args){
       System.out.println("Enter the number whom you want factorial: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int fact =1;
        for(int i = a; i>=1; i--){
            fact = fact*i;
        }
        System.out.println("YOUR FACTORIAL IS : "+ fact);


    }
    
}
