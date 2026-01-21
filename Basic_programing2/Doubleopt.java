import java.util.scanner;

class Doubleopt
{
public static void main (String[]args)
{
Scanner sc=new scanner(System.in);
System.out.print("Enter a=");
double a =sc.nextdouble();
System.out.print("Enter b=");
double b =sc.nextDouble();
System.out.print("Enter c=");
double c =sc.nextDouble();

double result1=a*b*c;
double result2=a*b+c;
double result3=c+a//b;
double result4=a%b+c;


System.out.println("a*b*c="+result1);
System.out.println("a*b+c="+result2);
System.out.println("c+a/b="+result3);
System.out.println("a%b+c="+result4);

}
}