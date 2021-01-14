package package3;
import java.util.Scanner;
public class patterns3 {
    public static void main(String[] args){

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("How much width do you want? ");
        num = sc.nextInt();


        for (int i = 1; i <= num; i++){
            for (int j = num; j > i; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(" "+"#");
            }
            System.out.println();
        }
        for (int i = 2; i <= num; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for (int j = num; j >= i; j--){
                System.out.print("#"+" ");
            }
            System.out.println();
        }
    }
}

