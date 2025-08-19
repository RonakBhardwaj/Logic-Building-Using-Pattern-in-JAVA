import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Value Here :");
        int n = input.nextInt();

        for(int row = 1; row <= n ;row++){
            if((row == 1 ) || (row == n)){
                for(int col = 1; col <= n ; col++){
                    System.out.print("*");
                }
            }
            else{
                for(int col = 1; col <= n; col++){
                    if((col == 1) || (col == n)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
