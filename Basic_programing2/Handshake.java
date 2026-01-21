import java.util.scanner;

class Handshake
{
public static void main (String[]args)
{
Scanner sc=new scanner(System.in);
System.out.print("Enter number of students=");
int n =sc.nextInt();
int Handshake=(n*(n-1))/2;
System.out.println("Maximum number of possible handshake");

}
}