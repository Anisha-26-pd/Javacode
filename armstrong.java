import java.util.*;
public class armstrong{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = 153;
    int a = number;
    int b = number;
    int power = 0;
    int res =0;
    while(number!=0){
        number = number/10;
          power++;
    }
    while(a!=0){
        int rem = a%10;
        res += (int)Math.pow(rem, power);
        a = a/10;
    }
     if( res==b){
        System.out.println("Given number is aramstrong");
     }
     else
     System.out.println("Not a armstrong number");
    
    

}

}
