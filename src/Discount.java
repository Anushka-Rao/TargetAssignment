import java.util.Scanner;

public class Discount {
    public static void main(String args[])
    {
        float old_price,discount_percent,discount,amount;
        Scanner sc = new Scanner(System.in);
        old_price=50;
        discount_percent=12;
        discount=old_price*(discount_percent/100);
        System.out.print("Dicount is "+discount+" RS\n");
        System.out.print("Final price is "+(old_price-discount)+" RS");
    }
}
