import java.util.Scanner;
public class SimpleInterest {
    public static void main(String args[])
        {
            float p,t,r,si;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Principle : ");
            p=sc.nextFloat();
            System.out.print("Enter the rate of interest : ");
            r=sc.nextFloat();
            System.out.print("Enter the time period : ");
            t=sc.nextFloat();
            sc.close();
            si=(p*t*r)/100;
            System.out.print("The Simple Interest is : "+si);
        }
    }
