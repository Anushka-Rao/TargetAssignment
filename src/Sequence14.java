import java.util.Scanner;
// to print 1,4,7,12,23......
public class Sequence14 {
    public static void main(String[] args)
    {
        System.out.print("Enter range : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=1,b=4,c=7,sum=0;
        for(int i=1;i<=n;i++)
        {
            System.out.print(a + " ");
            sum = a+b+c;
            a = b;
            b = c;
            c = sum;
        }
    }
}
