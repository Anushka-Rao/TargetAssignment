import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int base , exponent ;
        long result = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base value : ");
        base=sc.nextInt();
        System.out.print("Enter exponent value : ");
        exponent=sc.nextInt();
        while (exponent != 0) {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);
    }
}
