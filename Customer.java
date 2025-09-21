package HolidayTravelVehicles;

import java.util.ArrayList;
import java.util.Date;

public class Customer extends Guest{
    
    private int customerId;
    private String name;
    private String address;
    private int phoneNum;
    private Date birthDate;
    private ArrayList<DealerInstallation> installations;
    private ArrayList<Negotiation> offers;

    public Customer(int customerId, String name, String address, int phoneNum, Date birthDate, 
                    ArrayList<DealerInstallation> installations, ArrayList<Negotiation> offers){
       this.customerId = customerId;
       this.name = name;
       this.address = address;
       this.phoneNum = phoneNum;
       this.birthDate = birthDate;
       this.installations = installations;
       this.offers = offers;
    }
}
