class Kilometer_to_Miles
{
public static void main(String [] args)
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter number of pens and number of students=");
int pens=sc.nextInt();
int students=sc.nextInt();
int ques=pens/students;
int rem=pens%students;


System.out.println("Quesent="+ques);
System.out.println("Remendir="+rem);
}
}