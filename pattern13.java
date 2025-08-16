import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value of N: ");
        int n = input.nextInt();
        int sum = 1;
        for(int i = 0;i < n ; i++){
            for(int j = 0; j <= i ;j++){
                System.out.print(sum);
                System.out.print(" ");
                sum = sum + 1;
            }
            System.out.println();
        }
    }
}
