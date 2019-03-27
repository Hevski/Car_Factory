package Vehicles;

import CarParts.IVehiclePart;

public class MotorBike extends Vehicle {

    private IVehiclePart carPart;

    public MotorBike(int price, String colour, IVehiclePart carPart) {
        super(price, colour);
        this.carPart = carPart;
    }

    public IVehiclePart getCarPart() {
        return carPart;
    }
}
