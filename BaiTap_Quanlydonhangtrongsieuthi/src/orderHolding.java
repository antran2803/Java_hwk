public class orderHolding {
    private Order order;
    private int quantity;
    public orderHolding(Order order, int quantity) {
        this.order = order;
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }


    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return order.getPrice()*quantity;
    }
}











































