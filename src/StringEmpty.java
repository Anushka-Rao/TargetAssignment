import java.util.Scanner;

public class StringEmpty {
    public static boolean isStringEmpty(String str)
    {
        if (str.isEmpty())
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        str = sc.nextLine();
        System.out.println("Is string \"" + str
                + "\" empty? "
                + isStringEmpty(str));

    }
}
