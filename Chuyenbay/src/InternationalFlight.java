public class InternationalFlight extends Flight{
    public InternationalFlight(String flightID, String destination, String departureTime) {
        super(flightID, destination, departureTime);
    }
    @Override
    public void fareDetails() {
        System.out.println("Chuyen bay quoc te gia: 500.000 VND");
    }
    public void ruleInternational() {
        System.out.println("Khong hut thuoc o chuyen bay nay!");
    }
}
