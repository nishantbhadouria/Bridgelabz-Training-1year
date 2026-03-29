package Problem_2;

public class Runner {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new bus();

        v1.rent();
        v2.rent();
        v3.rent();

        v1.returnVehicle();
        v2.returnVehicle();
        v3.returnVehicle();
    }
}