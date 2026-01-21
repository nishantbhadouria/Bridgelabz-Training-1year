class Harry
{
public static void mian(String[]args)
{
scanner sc=new scanner (system.in);
System.out.println("Enter the birth year and current year");
int birthy=sc.nextInt();
int currenty=sc.nextInt();
int age=currenty-birthy;
System.out.println("Harry`s age="+age);
}
}