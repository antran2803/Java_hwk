import java.util.ArrayList;
import java.util.List;

public class ticketManagement {
    List<Ticket> tickets;

    public ticketManagement() {
        this.tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void updateTicketStatus(String flightID,ticketStatus status) {
    boolean ticketFound = false;
        for(Ticket ticket:tickets){
            //Neu ID nhap vao trung ID chuyen bay thi cap nhat trang thai chuyen bay
            if(ticket.getFlight().getFlightID().equals(flightID)){
                ticketStatus oldStatus= ticket.getStatus();
                ticket.updateStatus(status);
                ticketFound=true; //Danh dau trang thai da duoc cap nhat
                System.out.println("Da update trang thai cua ve voi ma ID la: "+ flightID + "Tu: " + oldStatus + " thanh: "+ status);
                break;
            }
        }
        if(!ticketFound)
        System.out.println("Khong tim thay ma ID "+ flightID+ " trong danh sach!");
    }
    public void historyFlight() {
        for(Ticket ticket: tickets){
            System.out.println(ticket);

        }
    }
}
