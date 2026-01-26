import java.util*;
class smaller_of_3
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter three no.s");
int a =sc.nextInt();
int b =sc.nextInt();
int c =sc.nextInt();
if(a<b && a<c)
{
System.out.println("a is smaller");
} else if(b<a && b<c)
{
System.out.println("b is smalller");
} else
{
System.out.println(" c is smaller");
}
}
}
}