import java.util.*;
public class Quadratic
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of a");
        double a=input.nextDouble();
        System.out.println("Enter the value of b");
        double b=input.nextDouble();
        System.out.println("Enter the value of c");
        double c=input.nextDouble();
        double d=b*b-4*a*c;
        if(d>0)
        {
            double r1=(-b+Math.sqrt(d))/(2*a);
            double r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("the roots are real and distinct");
            System.out.println("the value of r1 is "+r1);
            System.out.println("the value of r2 is "+r2);
        }
        else if(d==0)
        {
            double r1=-b/(2*a);
            System.out.println("the roots are real and equal");
            System.out.println("the value of r1 and r2 is"+r1);
        }
        else
        {
            double realpart=-b/(2*a);
            double imgpart=Math.sqrt(-d)/(2*a);
            System.out.println("the roots are complex and imaginary");
            System.out.println("the value of r1 is "+realpart+"+"+imgpart+"i");
            System.out.println("the value of r2 is "+realpart+"-"+imgpart+"i");
        }
    }
}