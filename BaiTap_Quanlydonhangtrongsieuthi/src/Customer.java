import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String address;
    private String phoneNumber;
    private List<orderItem> orders;

    public Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.orders = new ArrayList<>();
    }

    public void addOrder(orderItem order) {
        orders.add(order);
    }

    public void displayInfo() {
        System.out.println("Khách hàng: " + name);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Số điện thoại: " + phoneNumber);
        System.out.println("Lịch sử đơn hàng:");

        int orderNumber = 1;
        for (orderItem order : orders) {
            System.out.println("- Đơn hàng " + orderNumber + ":");
            for (orderHolding item : order.getItems()) {
                System.out.println("  + Sản phẩm: " + item.getOrder().getNameProduct() +
                        ", Số lượng: " + item.getQuantity() +
                        ", Giá: " + item.getOrder().getPrice() + " VND");
            }
            System.out.println("  Tổng chi phí đơn hàng: " + order.getTotalPrice() + " VND\n");
            orderNumber++;
        }
    }
}












































