import java.util.*;
public class kaju_katli {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("give number of Rows : ");
        int x = sc.nextInt();
        for (int i = 1 ; i<=x ; i++){
            for(int j = 1 ; j<=(x-i);j++ ){
                System.out.print(" ");
            }
            for (int j = 1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = x ; i>=1 ; i--){
            for(int j = 1 ; j<=(x-i);j++ ){
                System.out.print(" ");
            }
            for (int j = 1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
            sc.close();
        }
    }   
}


