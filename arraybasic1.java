import java.util.*;
public class arraybasic1 {
    public static void main(String[] args){
        //check given number is exist in array or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yur number which you want:");
        int arr1[] ={23, 56, 49, 88, 41 ,56 , 67};
        boolean count=false;
        int num = sc.nextInt();
        for(int i =0;i<arr1.length;i++){
            if(num==arr1[i]){
                count = true;
                break;
            }
        }
            if(count){
              System.out.println("Number exist");
            }
            else {
                System.out.println("number is not exist");
            }
        //print array element in reverse order
        System.out.println("Your Reverse array: ");
        for(int j=arr1.length; j>0 ;j--){
            System.out.print( " " +arr1[j-1]);
        }
      
        //copy array element to another array
        int arr2[] =new int[arr1.length];
       System.out.println("");
       for(int k=0; k<arr2.length; k++){
        arr2[k]=arr1[k];
        System.out.print(" " + arr2[k]);
       }


    }
    
}
