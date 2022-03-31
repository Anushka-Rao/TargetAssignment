import java.util.Scanner;

public class AlternateNegative {
    public static void main(String args[])
    {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range n : ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++)
        {
            if (i % 2 != 0)
            {
                System.out.print(" -" + i);
            }
            else
            {
               System.out.print(" "+i);
            }
        }
    }
}
