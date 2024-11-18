import java.util.ArrayList;
import java.util.List;

public class medicalStatus {
    private List<MedicalService> serviceList;
    private String nameCustomer;
    private String bookDate;

    public medicalStatus(String nameCustomer, String bookDate) {
        this.nameCustomer = nameCustomer;
        this.bookDate = bookDate;
        this.serviceList = new ArrayList<>();
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBookDate() {
        return bookDate;
    }

    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }

    public void getServiceList(MedicalService service) {
        serviceList.add(service);

    }

    public void setServiceList(List<MedicalService> serviceList) {
        this.serviceList = serviceList;
    }
}
