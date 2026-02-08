import java.util.Scanner;
class StudentGrades2D
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of students:");
int n=sc.nextInt();
int marks[][]=new int[n][3];
double percentage[]=new double[n];
char grade[]=new char[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter Phy,Chem,Maths marks of student "+(i+1));
marks[i][0]=sc.nextInt();
marks[i][1]=sc.nextInt();
marks[i][2]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
percentage[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3.0;
if(percentage[i]>=80)
grade[i]='A';
else if(percentage[i]>=70 && percentage[i]<=79)
grade[i]='B';
else if(percentage[i]>=60 && percentage[i]<=69)
grade[i]='C';
else if(percentage[i]>=50 && percentage[i]<=59)
grade[i]='D';
else if(percentage[i]>=40 && percentage[i]<=49)
grade[i]='E';
else
grade[i]='R';
}
System.out.println("PHY\tCHEM\tMATH\tPercentage\tGrade");
for(int i=0;i<n;i++)
{
System.out.printf("%d\t%d\t%d\t%.2f\t\t%c\n", marks[i][0],marks[i][1],marks[i][2],percentage[i],grade[i]);
}
sc.close();
}
}



