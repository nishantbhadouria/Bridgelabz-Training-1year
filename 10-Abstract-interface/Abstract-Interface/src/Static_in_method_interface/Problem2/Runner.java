package Static_in_method_interface.Problem2;

public class Runner
{
    public static void main(String[] args)
    {
        double km = 10;
        double kg = 5;
        double miles = UnitConverter.kmToMiles(km);
        double lbs = UnitConverter.kgToLbs(kg);
        System.out.println("Miles: " + miles);
        System.out.println("Pounds: " + lbs);
    }
}