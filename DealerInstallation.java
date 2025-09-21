package HolidayTravelVehicles;

public class DealerInstallation {

    private int customerId;
    private int vehicleId;
    private int optionCode;
    public String details;
    public String options;
    private Customer customer;
    private Invoice invoice;

    public DealerInstallation(int customerId, int vehicleId, int optionCode, String details,
                                String options, Customer customer, Invoice invoice){
        this.customerId = customerId;
        this.vehicleId = vehicleId;
        this.optionCode = optionCode;
        this.details = details;
        this.options = options;
        this.customer = customer;
    }

    public void getOptionCode(){
        System.out.println("Option: " + optionCode);
    }
}
