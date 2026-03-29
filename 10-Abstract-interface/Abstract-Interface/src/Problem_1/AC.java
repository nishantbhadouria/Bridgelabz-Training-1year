package Problem_1;

public class AC implements SmartDevice
{
    public void turnOn()
    {
        System.out.println("AC ON");
    }
    public void turnOff()
    {
        System.out.println("AC OFF");
    }

    public static void main(String[] args) {
        AC ac= new AC();
        ac.turnOn();
        ac.turnOff();
    }
}