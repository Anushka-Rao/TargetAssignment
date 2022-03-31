import java.util.Scanner;
// to print 1,-2,4,-6,7,-10.......
public class Sequence23 {
        public static void main(String[] args) {
            int  n,i=0,j=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the  number ");
            n = sc.nextInt();
            for(i=1,j=-2;n>=0;i+=3,j+=-4)
            {
                System.out.print(i+" "+j+" ");
                n-=2;
            }


        }
}
