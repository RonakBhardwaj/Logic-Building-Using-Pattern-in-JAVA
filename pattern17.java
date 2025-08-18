import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Value :");
        int n = input.nextInt();
        for(int LoopCount = 1; LoopCount <= n ;LoopCount++){
            for(int SpaceCount = 0; SpaceCount < (n-LoopCount); SpaceCount++){
                System.out.print(" ");
            }
            char ch = 'A';
            for(int leftPy = 1 ; leftPy <= LoopCount;leftPy++) {
                System.out.print(ch);
                ch++;
            }
            ch -= 2;
            for(int rightpy = 1; rightpy <LoopCount;rightpy++){
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
    }
}
