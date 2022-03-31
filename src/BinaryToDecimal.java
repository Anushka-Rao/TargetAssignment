import java.util.Scanner;

public class BinaryToDecimal {
    public static int getDecimal(int binary){
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }
    public static void main(String args[]){
        int num;
        System.out.print("Enter the binary number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Decimal of "+num+" is: "+getDecimal(num));

    }
}
