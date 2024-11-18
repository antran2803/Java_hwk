public class Main {
    public static void main(String[] args) {
    Order milk= new Order("P001","Sua",20450 );
    Order cake = new Order("P002","Banh kem",150900 );
    Order soda= new Order("P003","Nuoc ngot",15450 );
    orderItem order1 = new orderItem();
    order1.addItem(milk,10);
    order1.addItem(soda,5);
    orderItem order2= new orderItem();
    order2.addItem(cake,3);
    Customer khach= new Customer("Nguyễn Văn A", "123 Đường ABC, TP. HCM", "0987xxxxxx");
    khach.addOrder(order1);
    khach.addOrder(order2);
    khach.displayInfo();
    }
}