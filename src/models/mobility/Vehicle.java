package models.mobility;

public  abstract class Vehicle {
    private String registrationNumber;
    private String color;
    private VehicleType vehicleType;

    public Vehicle(String color, String registrationNumber, VehicleType vehicleType) {
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
