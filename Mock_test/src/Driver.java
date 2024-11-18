import java.util.ArrayList;
import java.util.Scanner;

public class Driver extends User {
    private boolean Available;
    Driver (String userId, String phoneNumber, String name) {
        super(userId,phoneNumber,name );
        this.Available=true;
    }
    public boolean Available(){
        return Available;
    }
    public void setAvailable ( boolean available) {
        this.Available= available;
    }
    public void acceptRide(Ride chuyen) {
        if(Available){
            chuyen.setDriver(this);
            chuyen.setStatus("Accepted");
            this.setAvailable(false);
            System.out.println("Ride accepted: "+ this.getName());

        }
        else {
            System.out.println("Driver is currently busy");
        }
    }


}

