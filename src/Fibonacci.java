import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int n , firstTerm = 1, secondTerm = 1;
        System.out.print("Enter number of terms : ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Fibonacci Series till " + n + " terms:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
