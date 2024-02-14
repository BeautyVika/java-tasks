package Task7;

public class Car extends Vehicle{
    private int numDoors;

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public void setFuelType(String fuelType) {
        super.setFuelType(fuelType.toUpperCase());
    }
}
