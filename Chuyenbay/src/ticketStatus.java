import java.util.Date;

public class ticketStatus {
    private String statusName;
    //Dat trang thai cac ve
    public static final ticketStatus Booked= new ticketStatus("Booked");
    public static final ticketStatus Cancelled= new ticketStatus("cancelled");
    public static final ticketStatus Paid= new ticketStatus("paid");

    public ticketStatus(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }

    public String toString() {
        return statusName;
    }
}
