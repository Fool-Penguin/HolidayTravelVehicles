package HolidayTravelVehicles;
import java.util.Date;

public class Invoice {
    
    private int invoiceId;
    private int empId;
    private int customerId;
    private int vehicleId;
    public int finalCost;
    public Date date;
    public String dealerInstallations;

    public Invoice(int invoiceId, int empId, int customerId, int vehicleId, int finalCost, Date date, String dealerInstallations){
        this.invoiceId = invoiceId;
        this.empId = empId;
        this.customerId = customerId;
        this.vehicleId = vehicleId;
        this.finalCost = finalCost;
        this.date = date;
        this.dealerInstallations = dealerInstallations;
    }

    public void getInvoiceId(){
        System.out.println("Invoice ID: " + invoiceId);
    }
}
