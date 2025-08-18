import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Value :");
        int n = input.nextInt();
//        first pattern loop\
        for(int row = 0 ; row < n;row++){
            for(int col = n ; col > row; col--){
                System.out.print("*");
            }
            for(int spaceCount = 0; spaceCount < (2 * row); spaceCount++){
                System.out.print(" ");
            }
            for(int col = n ; col > row; col--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row = 1 ; row <= n;row++){
            for(int col = 1 ; col <= row; col++){
                System.out.print("*");
            }
            for(int spaceCount = 0; spaceCount < (2 * (n - row)); spaceCount++){
                System.out.print(" ");
            }
            for(int col = 1 ; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
