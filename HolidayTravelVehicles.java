package HolidayTravelVehicles;
import java.util.Date;

public class HolidayTravelVehicles {
    public static void main(String[] args){

        Date date = new Date();
        Record record = new Record(1, 123, date);   
        record.getRecordId();
    }
}
