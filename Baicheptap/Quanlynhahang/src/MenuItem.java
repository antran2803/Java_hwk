public class MenuItem {
    private String nameFood;
    private int price;
    private String description;

    public MenuItem(String nameFood, int price, String description) {
        this.nameFood = nameFood;
        this.price = price;
        this.description = description;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
