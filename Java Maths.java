import java.util.Scanner;

public class JavaMathematics 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Value for Num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the Value for Num2: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.print("The Sum is: ");
        System.out.println(sum);

        int diff = num1 - num2;
        System.out.print("The Difference is: " );
        System.out.println(diff);

        int prod = num1 * num2;
        System.out.print("The Product of is: ");
        System.out.println(prod);

        int div = num1 / num2;
        System.out.print("The Division is: ");
        System.out.println(div);

        int mod = num1 % num2;
        System.out.print("The Modulus is: ");
        System.out.println(mod);
    }    
}
