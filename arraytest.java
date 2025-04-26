import java.util.*;
public class arraytest {
    public static void main(String[] args) {
        System.out.println("programe to find maximum and index of maximum element of any length of array ");
        Scanner sc = new Scanner (System.in);
        System.out.print("give length of array :");
        int x = sc.nextInt();
        System.out.print("type all elements of your array :");
        int [] arr = new int [x] ; 
        for (int i = 0 ; i<x ; i++){
          arr[i] = sc.nextInt ();
        }
          int ind= 0 ;  
        int max = 0 ;
        for (int i = 0 ; i < x ; i++ ){
          if(max < arr[i]){
            max = arr[i];
            ind = i ;
          }
        }
        System.out.print("maximum element of given array is : "+max +" and present at index :"+ind);
       
    }
}
