import java.util.Scanner;
class BMIUsing1D
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of persons:");
int n=sc.nextInt();
double weight[]=new double[n];
double height[]=new double[n];
double bmi[]=new double[n];
String status[]=new String[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter weight and height of person "+(i+1));
weight[i]=sc.nextDouble();
height[i]=sc.nextDouble();
}
for(int i=0;i<n;i++)
{
bmi[i]=weight[i]/(height[i]*height[i]);
if(bmi[i] <= 18.4)
status[i]="Underweight";
else if(bmi[i] > 18.4 && bmi[i] <= 24.9)
status[i]="Normal";
else if(bmi[i] > 24.9 && bmi[i] <= 39.9)
status[i]="Overweight";
else if(bmi[i] > 39.9)
status[i]="Obese";
}
System.out.println("Weight\tHeight\tBMI\tStatus");
for(int i=0;i<n;i++)
{
System.out.printf("%.2f\t%.2f\t%.2f\t%s\n",weight[i],height[i],bmi[i],status[i]);
}
sc.close();
}
}









