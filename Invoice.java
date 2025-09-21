package HolidayTravelVehicles;
import java.util.ArrayList;
import java.util.Date;

public class Invoice {
    
    private int invoiceId;
    private int empId;
    private int customerId;
    private int vehicleId;
    public int finalCost;
    public Date date;
    public String dealerInstallations;
    private ArrayList<DealerInstallation> installations;
    private Negotiation negotiation;
    private Transaction transaction;

    public Invoice(int invoiceId, int empId, int customerId, int vehicleId, int finalCost, Date date, String dealerInstallations, 
                    ArrayList<DealerInstallation> installations, Negotiation negotiation, Transaction transaction){
        this.invoiceId = invoiceId;
        this.empId = empId;
        this.customerId = customerId;
        this.vehicleId = vehicleId;
        this.finalCost = finalCost;
        this.date = date;
        this.dealerInstallations = dealerInstallations;
        this.installations = installations;
        this.transaction = transaction;
    }

    public void getInvoiceId(){
        System.out.println("Invoice ID: " + invoiceId);
    }
}
