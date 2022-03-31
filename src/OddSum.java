import java.util.Scanner;

public class OddSum {
        public static void main(String args[])
        {
            int n,i,sum=0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter end value of range: ");
            n=sc.nextInt();
            for(i=1;i<=n;i++)
            {
                if(i%2!=0)
                {
                    sum=sum+i;
                }

            }
            System.out.print("Sum of Odd numbers is : "+sum);
        }
    }

