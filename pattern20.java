import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value Here :");
        int n = input.nextInt();

        for(int row1 = 1 ; row1 <= n; row1++){
            for (int col1 = 1; col1 <= row1 ;col1++){
                System.out.print("*");
            }
            for(int spaceCount = 0; spaceCount < (2*(n - row1)); spaceCount++){
                System.out.print(" ");
            }
            for (int col2 = 1; col2 <= row1 ; col2++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int row2 = 1; row2 < n; row2++){
            for (int col1 = n; col1 > row2; col1--){
                System.out.print("*");
            }
            for(int spaceCount = 0; spaceCount < (2*row2); spaceCount++){
                System.out.print(" ");
            }
            for (int col2 = n; col2 > row2; col2--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
