import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Value of N:");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("*");
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
