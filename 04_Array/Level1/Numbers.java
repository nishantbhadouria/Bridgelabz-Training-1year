import java.util.Scanner;
class Numbers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int[] arr = new int[5];
for(int i=0;i<arr.length;i++)
{
System.out.println("Enter number "+(i+1)+" :");
arr[i] = sc.nextInt();
if(arr[i]>0)
{
if(arr[i]%2==0)
{
System.out.println("Positive & Even");
}
else
{
System.out.println("Positive & Odd");
}
}
else if(arr[i]<0)
{
System.out.println("Negative");
}
else
{
System.out.println("Zero");
}
}
if(arr[0]<arr[arr.length-1])
{
System.out.println(arr[0]+" is less than "+arr[arr.length-1]);
}
else if(arr[0]>arr[arr.length-1])
{
System.out.println(arr[0]+" is greater than "+arr[arr.length-1]);
}
else
{
System.out.println(arr[0]+" is equal to "+arr[arr.length-1]);
}
sc.close();
}
}
