import java.util.Scanner;

public class SwapTwo {
    public static void main(String args[])
    {
        int a, b, swap;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a, b : ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before Swapping : ");
        System.out.println("Value of a "+a);
        System.out.println("Value of b "+b);
        swap=a;
        a=b;
        b=swap;
        System.out.println("After Swapping : ");
        System.out.println("Value of a "+a);
        System.out.println("Value of b "+b);
    }
}
