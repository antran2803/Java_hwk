import java.util.ArrayList;

public class CoffeeMenu  {
    private ArrayList<Coffee> menu;

    public CoffeeMenu() {
        menu = new ArrayList<>();
    }
    public void addToMenu(Coffee coffee) {
    menu.add(coffee);
    }
    public void displayMenu(){
         for(Coffee coffee:menu) {
             System.out.println(coffee);
         }
    }
}
