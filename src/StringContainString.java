import java.util.Scanner;

public class StringContainString {
    public static void main(String[] args)
    {
        String str="",str1="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first String ");
        str=sc.nextLine();
        System.out.println("Enter the second String ");
        str1=sc.nextLine();
        if(str.contains(str1))
            System.out.println("The first string contains the second string ");
        else
            System.out.println("The first string does not contain the second string ");
    }
}
