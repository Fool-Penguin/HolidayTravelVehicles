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
                    int baseCost, ArrayList<Salesperson> salespersons){
        this.vehicleId = vehicleId;
        this.serialNum = serialNum;
        this.name = name;
        this.model = model;
        this.year= year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
        this.salespersons = salespersons;
    }

    public void setRecord(Record record){
        this.record = record;
    }

    public Record getRecord(){
        return this.record;
    }

    public int getVehicleId(){
        return this.vehicleId;
    }

    public String getInfo(){
        return "Vehicle ID: " + vehicleId + " Serial: " + serialNum + " Name & model: " 
                            + manufacturer + " base: " + baseCost + " Saleperson: " + salespersons.toString();
    }
}
