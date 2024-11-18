public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("C001", "0123456789", "Alice");
        Driver driver = new Driver("D001", "0987654321", "Bob");
        driver.setAvailable(true);
        Ride ride1 = customer.bookRide("123 Main St","Los Angeles","New York");
        driver.acceptRide(ride1);
        Ride ride2 = customer.bookRide( "123 Down St","Oak St" ,"321 Pine St");
        driver.setAvailable(false);
        driver.acceptRide(ride2);
        System.out.println("Customer's ride history:");
        for (Ride ride : customer.gethistoryRide()) {
            System.out.println("Ride ID: " + ride.getRideId() + ", From: " + ride.getPickupLocation() + ", To: " + ride.getDestination() + ", Status: " + ride.getStatus());
        }



    }

}
