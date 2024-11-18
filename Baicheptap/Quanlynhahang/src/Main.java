
public class Main {
    public static void main(String[] args) {
        System.out.println("--------Test cau 1-------");
        Restaurant nhahang = new Restaurant("Kim Long", "Quan 2", "02331134");
        MenuItem chicken = new MenuItem("Ga chien", 10000, "an lien");
        MenuItem pizza = new MenuItem("Pizza", 150000, "ham qua lo vi song");
        MenuItem burger = new MenuItem("Hamburger", 25400, "an lien");
        MenuItem pasta = new MenuItem("Mi y", 30000, "nau so lai");
        Order order1 = new Order();
        order1.addItem(pizza);
        order1.addItem(burger);
        Customer khach = new Customer("Nguyen Van A", "234-133-123", "Quan 4");
        System.out.println("=== Initial Restaurant Information ===");
        System.out.println("Restaurant Name: " + nhahang.getName());
        System.out.println("Restaurant Address: " + nhahang.getAddress());
        System.out.println("Customer Name: " + khach.getName());
        System.out.println("--------Test cau 2-------- ");
        Chef chef = new Chef("Chef Gordon", "123-123-123", "789 Boulevard, City");

        chef.addMenuItem(pasta);
        chef.updateMenuItem(burger, pizza);

        System.out.println("\n=== Menu Management ===");
        restaurantManagement.displayMenu();

        System.out.println("--------Test cau 3-------- ");
        Waiter waiter = new Waiter("Alice", "987-654-321", "101 Road, City");

        waiter.addMenuItem(burger);
        waiter.updateMenuItem(burger,pizza);

        System.out.println("\n=== Orders Management ===");
        restaurantManagement.displayOrder();

        System.out.println("--------Test cau 4--------");
        CashPayment cashPayment = new CashPayment();
        cashPayment.PaymentMethod(15.99); // Thanh toán bằng tiền mặt

        CreditCardPayment creditPayment = new CreditCardPayment();
        creditPayment.PaymentMethod(20.99); // Thanh toán bằng thẻ tín dụng

        System.out.println("--------Test cau 5-------- ");
        restaurantManagement.addToMenu(pizza);
        restaurantManagement.addToMenu(burger);
        restaurantManagement.addToOrder(order1);

        System.out.println("\n=== Updated Menu and Orders ===");
        restaurantManagement.displayMenu();
        restaurantManagement.displayOrder();

        // 6. Overloading phương thức đặt hàng
        Orderable orderable = new Orderable();
        orderable.placeOrder("Pizza"); // Đặt hàng bằng tên món ăn
        orderable.placeOrder(101);     // Đặt hàng bằng ID sản phẩm
        orderable.placeOrder("Burger", 3); // Đặt hàng với tên món và số lượng

    }
}