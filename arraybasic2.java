import java.util.*;
public class arraybasic2 {
    public static void main(String[] args){
        // wap to count the frequency of number in given
        Scanner sc = new Scanner(System.in);
        int count;
        System.out.println("Enter yur size of array: ");
        int size =sc.nextInt();
        int arry[] = new int[size];
        System.out.println("Enter the element in array: ");
        try{
            for(int i=0; i<arry.length; i++){
           arry[i]= sc.nextInt();
        }
        } catch(ArrayIndexOutOfBoundsException ee){
            System.out.println("Your input value is out of array size");
        }
        
        int visit[]= new int[arry.length];
         for(int k=0; k<arry.length; k++){
              if(visit[k]==1)
              continue;
              count =1;
              for(int j=k+1; j<arry.length;j++){
                if(arry[k]==arry[j]){
                    count++;
                    visit[j]=1;
                }
              }
              System.out.println(arry[k]+ " repeats --> "+ count + " times.");

         }
        // count average and sum of array
        int a[]={45, 76, 19, 41, 64, 75, 67, 641, 567};
        int sum =0;
        for (int u=0; u<a.length; u++){
            sum = sum+a[u];
        }
        System.out.println("Sum of array is : "+ sum);
        System.out.println("Average of array is : " + sum/a.length);
    } 
    
}
