import java.util.Scanner;
class Copy2DTo1D
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter rows and columns");
int rows =sc.nextInt();
int columns = sc.nextInt();
int[][] matrix = new int[rows][columns];
System.out.println("Enter elements:");
for(int i=0;i<rows;i++)
{
for(int j=0;j<columns;j++)
{
matrix[i][j]=sc.nextInt();
}
}
int index=0;
int[] array = new int[rows*columns];
for(int i=0;i<rows;i++)
{
for(int j=0;j<columns;j++)
{
array[index]=matrix[i][j];
index++;
}
}
System.out.println("2D Array:");
for(int i=0;i<rows;i++)
{
for(int j=0;j<columns;j++)
{
System.out.print(matrix[i][j]+"  ");
}
System.out.println();
}
System.out.println("1D Array:");
for(index=0;index<array.length;index++)
{
System.out.print(array[index]+ "  ");
}
sc.close();
}
}

