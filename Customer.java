package HolidayTravelVehicles;

import java.util.Date;

public class Customer extends Guest{
    
    private int customerId;
    private String name;
    private String address;
    private int phoneNum;
    private Date birthDate;

    public Customer(int customerId, String name, String address, int phoneNum, Date birthDate){
       this.customerId = customerId;
       this.name = name;
       this.address = address;
       this.phoneNum = phoneNum;
       this.birthDate = birthDate;
    }
}
