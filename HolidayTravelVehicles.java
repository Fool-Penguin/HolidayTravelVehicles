package HolidayTravelVehicles;

import java.util.ArrayList;
import java.util.Date;

public class HolidayTravelVehicles {
    public static void main(String[] args){

        Date date = new Date();
        ArrayList<Salesperson> sales = new ArrayList<>();
        Salesperson salesperson1 = new Salesperson(1, "Thanadon Yin", "wherever", date, null, null);
        Salesperson salesperson2 = new Salesperson(2, "Usagi", "somewhere", date, null, null);
        
        sales.add(salesperson1);
        sales.add(salesperson2);

        ArrayList<Vehicle> cars = new ArrayList<>();
        Vehicle carA = new Vehicle(1,123,"Chiikawa","Honda model 1",1940,"Honda", 12000, sales);
        Vehicle carB = new Vehicle(2,124,"Hachiware","Toyota model 5",1995,"Toyota", 15000, sales);
        
        Record recordA = new Record(1, carA.getVehicleId(), date, null, null);
        Record recordB = new Record(2, carB.getVehicleId(), date, null, null);
        
        carA.setRecord(recordA);
        carB.setRecord(recordB);
        cars.add(carA);
        cars.add(carB);

        for (int i=0; i<cars.size(); i++) {
            System.out.println("Vehicle [" + i + "] " + cars.get(i).getInfo());
        }
    }
}
