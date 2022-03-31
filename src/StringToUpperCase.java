import java.util.Scanner;

public class StringToUpperCase {
    public static void main(String[] args) {
        String str ;
        Scanner sc = new Scanner(System.in);
        str=sc.nextLine();
        String strUpper = str.toUpperCase();
        System.out.println("Original String: " + str);
        System.out.println("String changed to upper case: "+ strUpper);
    }
}
