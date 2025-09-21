package HolidayTravelVehicles;
import java.util.Date;

public class Transaction{
    
    private int transactionId;
    private int invoiceId;
    private int customerId;
    private int vehicleId;
    public int finalCost;
    public Date date;

    public Transaction(int transactionId, int invoiceId, int customerId, int vehicleId, int finalCost, Date date){
        this.transactionId = transactionId;
        this.invoiceId = invoiceId;
        this.customerId = customerId;
        this.vehicleId = vehicleId;
        this.finalCost = finalCost;
        this.date = date;
    }

    public void getTransaction(){
        System.out.println("Transaction ID: " + transactionId);
    }
}