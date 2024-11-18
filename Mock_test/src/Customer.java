import java.util.ArrayList;
import java.util.List;
public class Customer extends User {
    private List<Ride> historyRide;
    Customer(String userId, String phoneNumber, String name) {
        super(userId, phoneNumber, name);
        this.historyRide = new ArrayList<>();
    }


    public Ride bookRide(String rideId,String pickupLocation, String destination) {
        Ride chuyen = new Ride(rideId,pickupLocation, destination, this);
        System.out.println("Chuyen xe dat boi: " + this.getName());
        historyRide.add(chuyen);
        return chuyen;
    }
    public List<Ride> gethistoryRide(){
        return historyRide;
    }
}
