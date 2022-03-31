import java.util.Scanner;

public class CompareString {
    public static void main(String[] args)
    {
        //Take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s1=sc.nextLine();
        System.out.println("Enter the string: ");
        String s2=sc.nextLine();
        //Compare two strings
        System.out.println("Are the two strings equal?" + s1.equals(s2));
    }
}
