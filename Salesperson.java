package HolidayTravelVehicles;

import java.util.ArrayList;
import java.util.Date;

public class Salesperson {
    private int empId;
    private String name;
    private String address;
    private Date startDate;
    private ArrayList<Negotiation> negotiations;
    private ArrayList<Vehicle> vehicles;

    public Salesperson(int empId, String name, String address, Date startDate, 
                        ArrayList<Negotiation> negotiations, ArrayList<Vehicle> vehicles){
        this.empId = empId;
        this.name = name;
        this.address = address;
        this.startDate = startDate;
        this.negotiations = negotiations;
        this.vehicles = vehicles;
    }

    public void getEmpId(){
        System.out.println("Employee ID: " + empId);
    }

    @Override
    public String toString(){
        return "Salesperson ID: " + empId + " name: " + name + " ";
    }
}
