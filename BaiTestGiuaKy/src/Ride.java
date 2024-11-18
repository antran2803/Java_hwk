class Ride {
    private static int rideCount = 0;
    private Customer customer;
    private Driver driver;
    private String rideID;
    private String pickupLocation;
    private String destination;
    private String status;

    public Ride(Customer customer, String pickupLocation, String destination) {
        this.customer = customer;
        this.pickupLocation = pickupLocation;
        this.destination = destination;
        this.rideID = "R" + (rideCount++);
    }
    public String getRideID() {
        return rideID;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public String getPickupLocation() {
        return pickupLocation;
    }
    public String getDestination() {
        return destination;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void displayRideInfo() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Ride ID: " + rideID);
        System.out.println("Pickup Location: " + pickupLocation);
        System.out.println("Destination Location: " + destination);
        System.out.println("Status: " + status);
        if (driver != null) {
            System.out.println("Driver: " + driver.getName());
        }
        System.out.println("-------------------------------------------------------------");
    }
}