import java.util.*;
public class palindrome {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int rev = 0;
    int num = sc.nextInt();
    int a = num;
    while(num!=0){
        int digit = num % 10;
        rev = rev*10 + digit;
        num = num/10;
    }
    if(a==rev){
        System.out.println("Given number is Palindrome");
    }
    else 
    System.out.println("Given number is not palindrome");



    }
    
}
