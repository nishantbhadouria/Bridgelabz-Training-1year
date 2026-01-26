import java.util.*;
class sum_till_neg
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter a num:");
		num =sc.nextInt();
		int sum=0;
		while(true)
		{
			if(num>0)
			{
			sum+=num;
			} else {
				break;
		}
		System.out.println("Enter a num:");
		 num=sc.nextInt();
		}
		System.out.println("Sum is:"+sum);
	}
}
			