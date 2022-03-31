import java.util.Scanner;

public class DoubleInteger {
    public static void main(String args[])
    {
        double doubleNumber ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        doubleNumber=sc.nextDouble();
        String doubleAsString = String.valueOf(doubleNumber);
        int indexOfDecimal = doubleAsString.indexOf(".");
        System.out.println("Double Number: " + doubleNumber);
        System.out.println("Integer Part: " + doubleAsString.substring(0, indexOfDecimal));
        System.out.println("Decimal Part: " + doubleAsString.substring(indexOfDecimal));
    }
}
