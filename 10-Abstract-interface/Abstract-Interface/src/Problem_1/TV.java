package Problem_1;

public class TV implements SmartDevice {
    public void turnOn() {
        System.out.println("TV ON");
    }
    public void turnOff() {
        System.out.println("TV OFF");
    }
    public static void main(String[] args) {
        TV tv= new TV();
        tv.turnOn();
        tv.turnOff();
    }
}