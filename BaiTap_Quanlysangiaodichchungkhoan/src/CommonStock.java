public class CommonStock extends Stock {

    public CommonStock(String symbol, String companyName, double price, int volume) {
        super(symbol, companyName, price, volume);
    }

    @Override
    public void displayInfo() {
        System.out.println("Day la co phieu thuong.");
    }
}
