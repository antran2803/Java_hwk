public class Ticket {
    private String nameCustomer;
    private Flight flight;
    private String bookingDate;
    private ticketStatus status;

    public Ticket(String nameCustomer, Flight flight, String bookingDate) {
        this.nameCustomer = nameCustomer;
        this.flight = flight;
        this.bookingDate = bookingDate;
        this.status = ticketStatus.Booked; //De mac dinh la dat
    }
    public ticketStatus getStatus(){
        return  status;
    }
    public void updateStatus(ticketStatus newStatus) {
        this.status = newStatus;
    }

    public String getupdateStatus() {
        return "Ve duoc cap nhat tu: "+ this.status;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Override
    public String toString() {
        return "Ve{" +
                "Khach hang:'" + nameCustomer + '\'' +
                ", chuyen bay:" + flight.getFlightID() +
                ", ngay dat:'" + bookingDate + '\'' +
                ", trang thai chuyen bay:  " + status +
                '}';
    }
}