import java.util.ArrayList;
import java.util.List;

public class restaurantManagement {
    public static List<MenuItem> menuList = new ArrayList<>();
    public static List<Order> orderList = new ArrayList<>();
    public static void addToMenu (MenuItem item) {
        menuList.add(item);
    }
    public static void addToOrder(Order order ) {
        orderList.add(order);
        }
    public static void displayMenu(){
        for(MenuItem item: menuList) {
            System.out.println( "Ten mon: "+ item.getNameFood()+ "- gia: "+item.getPrice());
        }
    }
    public static void displayOrder(){
        for(Order order: orderList) {
            System.out.println("Ten don hang: "+ order.getOrdered() + "- ngay va gio dat don hang: "+ order.getOrderDate());
        }
    }
}
