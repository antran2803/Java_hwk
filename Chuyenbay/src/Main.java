import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ticket> ticketList = new ArrayList<>();
        Flight chuyennoidia = new DomesticFlight("DCT123", "Ho Chi Minh", "01/01/2024");
        Flight chuyenquocte = new InternationalFlight("ABC1", "Singapore", "30/04/1975");
        Flight chuyengiare = new LowCostFlight("MCK12", "Da Nang", "02/09/1945");

        Ticket ticket1 = new Ticket("C001", chuyennoidia,"2/3/2023");
        Ticket ticket2 = new Ticket("C002", chuyenquocte, "3/1/1932");


        ticketManagement manager = new ticketManagement();
        manager.addTicket(ticket1);
        manager.addTicket(ticket2);


        manager.updateTicketStatus("DCT123", ticketStatus.Paid);
        manager.updateTicketStatus("ABC1", ticketStatus.Cancelled);
        manager.historyFlight();
        chuyengiare.fareDetails();
        chuyenquocte.fareDetails();
        chuyennoidia.fareDetails();
        manager.updateTicketStatus("ABC1", ticketStatus.Paid);
    }

}
