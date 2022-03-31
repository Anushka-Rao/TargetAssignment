import java.util.Scanner;

public class StringLength {
    public static void main(String[] args)
    {
        String str ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        str = sc.nextLine();
        System.out.println("The size of the String is " + str.length());
    }
}
