import java.util.*;
public class basic {
     public static int sum(int a, int b){
          int add =a+b;
          return add;
        }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("please enter two digit");
       if(sc.hasNextInt()){
        int one = sc.nextInt();
        int two = sc.nextInt();
       if(one>0 && two>0)
       System.out.println( "addition is : "+ sum(one, two));
       else if (one<0 && two<0 || one>0 && two<0 || one<0 && two>0) {
        System.out.println("Entered number is negative we can't sum");
       }
      }
       else{
        System.out.println("input number is invalid");
       }
    }
}
