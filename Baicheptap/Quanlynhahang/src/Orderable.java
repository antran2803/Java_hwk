public class Orderable {
    public void placeOrder( String itemName) {
        System.out.println("Dat do an bang ten mon an: "+ itemName);
    }
    public void placeOrder( int idProduct) {
        System.out.println("Dat do an bang ID san pham: " + idProduct);
    }
    public void placeOrder(String itemName, int quantity ) {
        System.out.println("Dat do an bang ten: "+itemName+" voi so luong: "+ quantity);
    }
}
