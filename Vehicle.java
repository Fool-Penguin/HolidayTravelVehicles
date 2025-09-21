package HolidayTravelVehicles;

public class Vehicle {
    
    private int vehicleId;
    public int serialNum;
    public String name;
    public String model;
    public int year;
    public String manufacturer;
    public int baseCost;
    
    public Vehicle(int vehicleId, int serialNum, String name, String model, int year, String manufacturer, int baseCost){
        this.vehicleId = vehicleId;
        this.serialNum = serialNum;
        this.name = name;
        this.model = model;
        this.year= year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }
}
