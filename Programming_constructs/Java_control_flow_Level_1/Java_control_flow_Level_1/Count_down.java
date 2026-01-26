import java.util.*;
class Count_down
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n==1)
		{
			System.out.println(n);
		} else
		{
			while(n>=1)
			{
				System.out.println(n);
				n--;
			}
		}
	}
}
