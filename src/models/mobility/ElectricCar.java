package models.mobility;

public class ElectricCar extends Vehicle implements ElectricVehicle{
    public ElectricCar(String color, String registrationNumber, VehicleType vehicleType) {
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
