package Task7;

public class Task7 {
    public static void main (String[] args){
        Vehicle vehicle = new Vehicle();
        vehicle.setModel("vaz");
        vehicle.setFuelType("diesel");

        Car car = new Car();
        car.setNumDoors(4);
        car.setModel("bmv");
        car.setFuelType("petrol");

        System.out.println("Vehicle model: " + vehicle.getModel() + ", fuel type: " + vehicle.getFuelType());
        System.out.println("Car model: " + car.getModel() + ", fuel type: " + car.getFuelType()
                            + ", number of doors: " + car.getNumDoors());
    }
}
