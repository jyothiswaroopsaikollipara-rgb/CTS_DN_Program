public class FactoryMain {

    public static void main(String[] args) {

        VehicleFactory factory = new VehicleFactory();

        Vehicle v1 = factory.getVehicle("CAR");

        Vehicle v2 = factory.getVehicle("BIKE");

        v1.drive();

        v2.drive();

    }

}