public class LowCostFlight extends Flight{
    public LowCostFlight(String flightID, String destination, String departureTime) {
        super(flightID, destination, departureTime);
    }

    @Override
    public void fareDetails() {
            System.out.println("Chuyen bay gia re gia: 200.000 VND");
    }
    public void ruleLowCost() {
        System.out.println("Di den dung gio!");
    }

}
