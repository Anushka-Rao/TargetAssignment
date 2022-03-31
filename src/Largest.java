import java.util.Scanner;

public class Largest {
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        a=sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        System.out.print("Largest number : ");
        if(a>b && a>c)
            System.out.println(+a);
        else if(b>c)
            System.out.println(+b);
        else
            System.out.println(+c);
        System.out.print("Second largest number : ");
        if(a>b && a<c || a>c && a<b)
            System.out.print(+a);
        else if(b>a && b<c || b>c && b<a)
            System.out.print(+b);
        else
            System.out.print(+c);
    }
}
