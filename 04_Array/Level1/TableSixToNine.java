import java.util.Scanner;
class TableSixToNine
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num = sc.nextInt();
int[] multiplicationTable = new int[4];
int i=0;
for(int j=6;j<=9;j++)
{
multiplicationTable[i]=num*j;
i++;
}
i=0;
for(int j=6;j<=9;j++)
{
System.out.println(num+" * "+j+" = "+multiplicationTable[i]);
i++;
}
sc.close();
}
}
