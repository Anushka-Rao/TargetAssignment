import java.util.Scanner;

public class SwapThree {
    public static void main(String args[])
    {
        int a, b, c, swap1,swap2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a, b, c : ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("Before Swapping : ");
        System.out.println("Value of a "+a);
        System.out.println("Value of b "+b);
        System.out.println("Value of c "+c);
        swap1=b;
        swap2=c;
        b=a;
        c=swap1;
        a=swap2;
        System.out.println("After Swapping : ");
        System.out.println("Value of a "+a);
        System.out.println("Value of b "+b);
        System.out.println("Value of c "+c);
    }
}
