package package3;

public class patterns2 {
    public static void main(String[] args){
        for (int i = 1; i <= 6; i++){
            for (int j = 8; j > i; j--){
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++){
                System.out.print(" "+"#");
            }
            System.out.println();
        }
        for (int i = 2; i <= 7; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for (int j = 8; j > i; j--){
                System.out.print("#"+" ");
            }
            System.out.println();
        }
    }
}
