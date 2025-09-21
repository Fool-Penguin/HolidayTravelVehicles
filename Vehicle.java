package HolidayTravelVehicles;

import java.util.ArrayList;

public class Vehicle {
    
    private int vehicleId;
    public int serialNum;
    public String name;
    public String model;
    public int year;
    public String manufacturer;
    public int baseCost;
    private ArrayList<Salesperson> salespersons;
    private Record record;

    public Vehicle(int vehicleId, int serialNum, String name, String model, int year, String manufacturer, 
                    int baseCost, ArrayList<Salesperson> salespersons, Record record){
        this.vehicleId = vehicleId;
        this.serialNum = serialNum;
        this.name = name;
        this.model = model;
        this.year= year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
        this.salespersons = salespersons;
        this.record = record;
    }
}
