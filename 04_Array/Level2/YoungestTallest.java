import java.util.Scanner;
class YoungestTallest
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String[] names={"Amar","Akbar","Anthony"};
int age[] = new int[3];
int height[] = new int[3];
for(int i=0;i<3;i++)
{
System.out.println("Enter age and height of "+names[i]+":");
age[i]=sc.nextInt();
height[i]=sc.nextInt();
}
int youngestIndex = 0;
int tallestIndex = 0;
for(int i=1;i<3;i++)
{
if(age[i]<age[youngestIndex])
youngestIndex=i;
}
for(int j=1;j<3;j++)
{
if(height[j]>height[tallestIndex])
tallestIndex=j;
}
System.out.println("Youngest: "+names[youngestIndex]);
System.out.println("Tallest: "+names[tallestIndex]);
sc.close();
}
}

 