import java.util.Scanner;
// to print 1,5,13,29,49......
public class Sequence16 {
    public static void main(String[] args)
    {
        System.out.print("Enter range : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1,j=1;j<=n;j++)
        {
            if(j%3!=0) {
                System.out.print(i + " ");
                i = i+4*j;
            }
        }
    }
}
