package CarParts;

public class Tyre implements IVehiclePart {

    private int size;
    private String brand;

    public Tyre(int size, String brand){
        this.size = size;
        this.brand = brand;
    }

    public int getAlloySize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }

    public void canAddPart() {

    }
}
