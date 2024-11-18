public class Ride {
private String rideId,pickupLocation,destination,status;
private Customer customer;
private Driver driver;

    public Ride(String rideId,String pickupLocation, String destination, Customer customer) {
        this.rideId = rideId;
        this.pickupLocation = pickupLocation;
        this.destination = destination;
        this.customer = customer;
        this.status = "Booked";
    }

    public String getRideId() {
        return rideId;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
