//declare an array integer of size 5
public class arraybasic {
    public static void main(String[] args){
        int arr[] = new int[5];
        int arr1[] = {1,45,67,28,92,12,54};
        for(int i =0 ;i<arr.length ;i++){
            arr[i]= i+2;
            System.out.print(" "+ arr[i]);
        }
        System.out.println(" ");
         foreachloop(arr1);
         len(arr1);

        //find largest and smallest number in array
        int largest = arr1[0] , smallest= arr1[0];
        for(int i=1; i<arr1.length ; i++){
           if(arr1[i]>largest){
            largest =arr1[i];
           }
        }
        System.out.println("Largest number of the array is " + largest);
        for(int j=1; j<arr1.length ; j++){
           if(arr1[j]<smallest){
            largest =arr1[j];
           }
        }
        System.out.println("Smallest number of the array is " + smallest);
    }
    
    //declare  array by using for-each loop in java 
   public static void foreachloop(int []arr2){
     for(int num:arr2){
        System.out.println("numbers: "+ num);
     }
    
 }
   // find out length of array
   public static void len(int ary[]){
    int count =0;
     try{
        while(true){
            int temp = ary[count];
            count++;
        }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("length of array :" + count);
        }
     
   }
   
  
}
// 
