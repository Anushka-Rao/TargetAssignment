import java.util.Scanner;

public class DecimalToBinary {
    public static void toBinary(int decimal) {
        int binary[] = new int[40];
        int index = 0;
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        System.out.println();//new line
    }

    public static void main(String args[]) {
        int num;
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Decimal of " + num + " is: ");
        toBinary(num);
    }
}
