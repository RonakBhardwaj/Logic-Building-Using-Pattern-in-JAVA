import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Value : ");
        int n= input.nextInt();
        for(int i = n;i > 0;i--){
            for(int j = 1;j <= i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
