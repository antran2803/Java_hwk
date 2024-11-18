import java.util.ArrayList;
import java.util.List;

public class orderItem {
    private List<orderHolding> items;
    public orderItem(){
        this.items= new ArrayList<>();
    }
    public void addItem(Order order,int quantity) {
        items.add(new orderHolding(order, quantity));
    }
    public double getTotalPrice() {
        double total = 0.0;
        for (orderHolding item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public List<orderHolding> getItems() {
        return items;
    }
}










































