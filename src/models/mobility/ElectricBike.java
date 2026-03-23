package models.mobility;

public class ElectricBike extends Vehicle implements ElectricVehicle {
    public ElectricBike(String color, String registrationNumber, VehicleType vehicleType) {
        super(color, registrationNumber, vehicleType);
    }

    @Override
    public void charge() {

    }

    @Override
    public float getBatteryLevel() {
        return 0;
    }
}
