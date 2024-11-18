public class DomesticFlight extends Flight{
    public DomesticFlight(String flightID, String destination, String departureTime) {
        super(flightID, destination, departureTime);
    }

    @Override
    public void fareDetails() {
        System.out.println("Chuyen bay noi dia gia: 300.000 VND");
    }
    public void ruleDomestic(){
        System.out.println("Hanh ly tren 10kg se dong phi phu thu!");
    }
}
