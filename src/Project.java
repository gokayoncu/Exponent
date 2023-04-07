import java.util.Scanner;

public class Project {
    static void exp(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of bases : ");
        a= input.nextInt();
        System.out.print("Enter the number of exponent :");
        b= input.nextInt();
        exp(a,b);
    }

}
