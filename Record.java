package HolidayTravelVehicles;

import java.util.ArrayList;
import java.util.Date;

public class Record {
    
    private int recordId;
    private int vehicleId;
    public Date importDate;
    private ArrayList<Vehicle> vehicles;
    private Negotiation negotiation;
    
    public Record(int recordId, int vehicleId, Date importDate, ArrayList<Vehicle> vehicles, Negotiation negotiation){
        this.recordId = recordId;
        this.vehicleId = vehicleId;
        this.importDate = importDate;
        this.vehicles = vehicles;
        this.negotiation = negotiation;
    }

    public void getRecordId(){
        System.out.println("Record ID: " + recordId);
    }
}
