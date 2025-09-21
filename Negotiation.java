package HolidayTravelVehicles;

public class Negotiation {
    
    private int negotiateId;
    private int customerId;
    private int empId;
    private int vehicleId;
    public int baseCost;
    public int finalCost;
    public String status;
    private Customer customer;
    private Invoice invoice;
    private Salesperson salesperson;
    private Record record;

    public Negotiation(int negotiateId, int customerId, int empId, int vehicleId, int baseCost, int finalCost, 
                        String status, Customer customer, Invoice invoice, Salesperson salesperson, Record record){
        this.negotiateId = negotiateId;
        this.customerId = customerId;
        this.empId = empId;
        this.vehicleId = vehicleId;
        this.baseCost = baseCost;
        this.finalCost = finalCost;
        this.status = status;
        this.customer = customer;
        this.invoice = invoice;
        this.salesperson = salesperson;
        this.record = record;
    }

    public void getNegotiateId(){
        System.out.println("Negotiation ID: " + negotiateId);
    }
}
