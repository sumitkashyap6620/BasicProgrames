
import java.util.Scanner;
public class Butterfly_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give no. of rows :");
        int x = sc.nextInt();
        for(int i = 1 ; i <= x ; i++){
            for (int j = 1 ; j <= i ; j++)System.out.print("* ");
            for (int k = 1 ; k <= x-i ; k++)System.out.print("  ");
            for (int k = 1 ; k <= x-i ; k++)System.out.print("  ");
            for (int l = 1 ; l <= i ; l++)System.out.print("* ");
            System.out.println();
            }
        for (int i = x-1 ; i > 0 ; i-- ){
            for (int j = 1 ; j <= i ; j++ )System.out.print("* ");
            for (int k = 1 ; k <= x-i ; k++)System.out.print("  ");
            for (int k = 1 ; k <= x-i ; k++)System.out.print("  ");
            for (int l = 1 ; l <= i ; l++)System.out.print("* ");
            System.out.println();
        }
         sc.close();
    }
}

