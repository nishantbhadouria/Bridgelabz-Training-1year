import java.util.Scanner;
class BMIUsing2D
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of persons:");
int n=sc.nextInt();
double personData[][]=new double[n][3];
String weightStatus[]=new String[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter height and weight of person "+(i+1));
personData[i][0]=sc.nextDouble();
personData[i][1]=sc.nextDouble();
if(personData[i][0]<0 || personData[i][1]<0)
{
System.out.println("Enter positive values");
return;
}

}
for(int i=0;i<n;i++)
{
personData[i][2]=personData[i][1]/(personData[i][0]*personData[i][0]);
double bmi=personData[i][2];
if(bmi <= 18.4)
weightStatus[i]="Underweight";
else if(bmi > 18.4 && bmi <= 24.9)
weightStatus[i]="Normal";
else if(bmi > 24.9 && bmi <= 39.9)
weightStatus[i]="Overweight";
else if(bmi > 39.9)
weightStatus[i]="Obese";
}
System.out.println("Height\tWeight\tBMI\tStatus");
for(int i=0;i<n;i++)
{
System.out.printf("%.2f\t%.2f\t%.2f\t%s\n",personData[i][0],personData[i][1],personData[i][2],weightStatus[i]);
}
sc.close();
}
}









