
public class Main {
    public static void main(String[] args) {

            Coffee coffee1 = new Coffee("Espresso", 30000, "nóng");
            Coffee coffee2 = new Coffee("Latte", 40000, "lạnh");
            Coffee coffee3 = new Coffee("Cappuccino", 35000, "nóng");

            CoffeeMenu menu = new CoffeeMenu();
            menu.addToMenu(coffee1);
            menu.addToMenu(coffee2);
            menu.addToMenu(coffee3);

            System.out.println("Thực đơn cà phê:");
            menu.displayMenu();
        }
}