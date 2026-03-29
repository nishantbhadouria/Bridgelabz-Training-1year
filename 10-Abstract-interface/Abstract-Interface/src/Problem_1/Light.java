package Problem_1;

    public class Light implements SmartDevice {


        public void turnOn() {
            System.out.println("Light ON");
        }

        public void turnOff() {
            System.out.println("Light OFF");
        }
        public static void main(String[] args) {
            Light light= new Light();
            light.turnOn();
            light.turnOff();
        }
    }
