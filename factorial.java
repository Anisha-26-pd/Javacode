import java.util.Scanner;
public class factorial {
    
    public static void main(String [] args){
       System.out.println("Enter the number whom you want factorial: ");
        Scanner s = new Scanner(System.in);
        if(s.hasNextInt()){
          int a = s.nextInt();
        int fact =1;
        if(a>0){
        for(int i = a; i>=1; i--){
            fact = fact*i;
        }
        System.out.println("YOUR FACTORIAL IS : "+ fact);
        }
        else
        System.out.println("Entered number is negative");
        }
       
        else
        System.out.println("Entered number is not valid");
       


    }
    
}
