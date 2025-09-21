package HolidayTravelVehicles;

import java.util.Date;

public class Record {
    
    private int recordId;
    private int vehicleId;
    public Date importDate;
    
    public Record(int recordId, int vehicleId, Date importDate){
        this.recordId = recordId;
        this.vehicleId = vehicleId;
        this.importDate = importDate;
    }

    public void getRecordId(){
        System.out.println("Record ID: " + recordId);
    }
}
