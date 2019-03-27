package CarParts;

import Vehicles.Vehicle;

public class Engine implements IVehiclePart {

    private String size;
    private int horsePower;
    private String type;

    public Engine(String size, int horsePower, String type){
        this.size = size;
        this.horsePower = horsePower;
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getType() {
        return type;
    }

    public String canAddPart(String vehicle) {
        return "I've been added to " + vehicle;

    }
}
