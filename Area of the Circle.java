import java.util.Scanner;

public class JavaMaths_Q1 
{
    public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);

            float radius = sc.nextFloat();            
            float pi = 3.14f;

            double area = pi * radius * radius;
            System.out.print("The Are of the Circle is: ");
            System.out.println(area);
    }    
}
