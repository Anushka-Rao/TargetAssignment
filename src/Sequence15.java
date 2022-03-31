import java.util.Scanner;
// to print 1,4,9,25,36....
public class Sequence15 {
    public static void main(String[] args)
    {
        System.out.print("Enter range : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=1;
        for(int i=2;i<=n;i++)
        {
            if(i%4==0)
                continue;
            System.out.print(a + " ");
            a = (int) Math.pow(i,2);
        }
    }
}
