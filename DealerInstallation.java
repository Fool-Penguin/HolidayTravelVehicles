package HolidayTravelVehicles;

public class DealerInstallation {

    private int customerId;
    private int vehicleId;
    private int optionCode;
    public String details;
    public String options;

    public DealerInstallation(int customerId, int vehicleId, int optionCode, String details, String options){
        this.customerId = customerId;
        this.vehicleId = vehicleId;
        this.optionCode = optionCode;
        this.details = details;
        this.options = options;
    }

    public void getOptionCode(){
        System.out.println("Option: " + optionCode);
    }
}
