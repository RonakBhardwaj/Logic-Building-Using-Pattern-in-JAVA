
import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value of N: ");
        int n = input.nextInt();
        for(int LoopCount = 1 ; LoopCount <= n ;LoopCount++){
            for(int PCount1 = 1 ; PCount1 <= LoopCount;PCount1++){
                System.out.print(PCount1);
            }
            for(int SapceCount = 1 ; SapceCount <= 2 * (n - LoopCount); SapceCount++){
                System.out.print(" ");
            }
            for(int PCount2 = LoopCount; PCount2 > 0; PCount2--){
                System.out.print(PCount2);
            }
            System.out.println();
        }
    }
}
