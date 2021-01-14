package package3;
import java.util.*;
public class patterns {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many lines do you want? ");
        n = sc.nextInt();
        for (int i = 1; i<= n; i++){
            for (int j = n+1; j > i; j--){ //for (int j = 1; j <= i; j++)
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
