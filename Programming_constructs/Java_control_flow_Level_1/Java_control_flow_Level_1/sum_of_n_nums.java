import java.util.*;
class sum_of_n_nums
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n>=0)
		{
		double sum=	n*(n+1)/2;
		System.out.println("Sum of"+n+"is:"+sum);
		} else
		{
			System.out.println("Not a natural no.");
		}
		
	}
}