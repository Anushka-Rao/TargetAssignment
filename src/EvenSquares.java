import java.util.Scanner;

public class EvenSquares {
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range n : ");
        n=sc.nextInt();
        for (int i = 2; i <= n; i = i + 2)
        {
            System.out.print((i * i) + " ");
        }
    }
}
