package HolidayTravelVehicles;
import java.util.Date;

public class Salesperson {
    private int empId;
    private String name;
    private String address;
    private Date startDate;

    public Salesperson(int empId, String name, String address, Date startDate){
        this.empId = empId;
        this.name = name;
        this.address = address;
        this.startDate = startDate;
    }

    public void getEmpId(){
        System.out.println("Employee ID: " + empId);
    }
}
