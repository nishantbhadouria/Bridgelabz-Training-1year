import java.util.Scanner;
class Heights
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double[] heights = new double[11];
double sum=0.0;
System.out.println("Enter heights");
for(int i =0;i<11;i++)
{
heights[i]=sc.nextInt();
sum=sum+heights[i];
}
double mean = sum/11;
System.out.println("Mean height= "+mean);
sc.close();
}
}
