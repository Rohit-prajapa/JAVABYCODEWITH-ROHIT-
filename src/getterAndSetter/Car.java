package getterAndSetter;

public class Car {
    private String color;
    private String model;
    private double fuelLevel;
    private long CostOfPurchase;

    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        CostOfPurchase = costOfPurchase;
    }

    public Car() {
    }

    public String getColor(){
        return color;
    }
    public String getModel(){
        return getModel();
    }
}
