public class Order {
    String codeProduct;
    String nameProduct;
    double price;

    public Order(String codeProduct, String nameProduct, double price ){
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }


    public double getPrice() {
        return price;
    }


}








































