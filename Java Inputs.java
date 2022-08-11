import java.util.*;

public class JavaInputs 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.next ();
        System.out.println(input);

        int num1 = sc.nextInt();
        System.out.println(num1);

        float num2 = sc.nextFloat();
        System.out.println(num2);

        Double num3 = sc.nextDouble();
        System.out.println(num3);
    }    
}
