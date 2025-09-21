package HolidayTravelVehicles;

public class Negotiation {
    
    private int negotiateId;
    private int customerId;
    private int empId;
    private int vehicleId;
    public int baseCost;
    public int finalCost;
    public String status;
    
    public Negotiation(int negotiateId, int customerId, int empId, int vehicleId, int baseCost, int finalCost, String status){
        this.negotiateId = negotiateId;
        this.customerId = customerId;
        this.empId = empId;
        this.vehicleId = vehicleId;
        this.baseCost = baseCost;
        this.finalCost = finalCost;
        this.status = status;
    }

    public void getNegotiateId(){
        System.out.println("Negotiation ID: " + negotiateId);
    }
}
