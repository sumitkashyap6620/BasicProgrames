import java.util.Scanner;
public class prime{
  public static void main(String args[]){
    System.out.print("give range : ");
    Scanner sc = new Scanner (System.in);
    int s = sc.nextInt();
    System.out.print(2+" ");
   for( int i = 3 ; i <= s ; i++){
    int t = 0 ;
    for( int j = 2 ; j < i ; j++){
   if( i%j == 0 ){
     t=1 ; 
      break;
   }
    }
      if(t==0){
        System.out.print(i+" ");
      }
   }
   sc.close();
  }
}
   