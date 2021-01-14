package package3;
import java.util.Scanner;
public class patterns4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= num; j++){
                System.out.print(" "+"x"+" ");
            }
            System.out.println();
        }
    }
}
