
import java.util.*;
public class HollowRectangle {
    public static void main(String[] args) {
        System.out.println("give number of rows and columns for the figure ");
        System.out.print("rows :");
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("columns :");
        int b = sc.nextInt();
       for(int i = 1 ; i <=a ; i++){
        for(int j = 1 ; j <=b ; j++){
            if( i == 1 || i == a || j == 1 || j == b ){
                System.out.print("# ");
                
            } 
            else
            System.out.print("  ");
        }System.out.println();
       }
            sc.close();

    }
    }
