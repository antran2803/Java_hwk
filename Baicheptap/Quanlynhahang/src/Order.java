
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Order {
    private List<MenuItem> ordered;
    private Date orderDate;

    public Order( ) {
        this.orderDate = new Date();
       this.ordered = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        ordered.add(item);
    }

    public List<MenuItem> getOrdered() {
        return ordered;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getOrderDate() {

        return orderDate;
    }

}
