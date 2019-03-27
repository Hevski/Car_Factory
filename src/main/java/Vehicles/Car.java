package Vehicles;

import CarParts.IVehiclePart;

public class Car extends Vehicle {

    private IVehiclePart carPart;

    public Car(int price, String colour, IVehiclePart carPart) {
        super(price, colour);
        this.carPart = carPart;
    }

    public IVehiclePart getCarPart() {
        return carPart;
    }
}
