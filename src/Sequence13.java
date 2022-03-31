import java.util.Scanner;

import static java.lang.Math.pow;
// to print 1,4,27,256,.....
public class Sequence13 {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range n : ");
        n = sc.nextInt();
        int i = 0;
        int a;
        for (i = 1; i <= n;i++) {
            a = (int) Math.pow(i,i);
            System.out.print(" "+a);
        }
    }
}
