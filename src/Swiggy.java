import Target.MyException;

import java.util.Scanner;

public class Swiggy {
    static boolean checkZip() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Zip code : ");
        String zip = sc.next();
        int n = zip.length();
        String last = zip.substring(n - 3, n);
        if (last.equals("123") || last.equals("456") || last.equals("789"))
            return true;
        else
            return false;
    }

    public static void main(String args[]) {
        try {
            if (checkZip())
                throw new MyException();
            else
                System.out.println("Delivery available in your area");
        } catch (MyException ex) {
            System.out.println("Not deliverable to this zipcode");
        }
    }
}
