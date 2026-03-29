package Problem_3;
public class Wallet implements Payment
{
    public void pay(double amount)
    {
        System.out.println("Paid using Wallet: " + amount);
    }
}