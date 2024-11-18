public class Stock {
    String symbol;
     String companyName;
     double price;
     int volume;

    public Stock(String symbol, String companyName, double price, int volume) {
        this.symbol = symbol;
        this.companyName = companyName;
        this.price = price;
        this.volume = volume;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void displayInfo() {
        System.out.println("Ma co phieu: " + getSymbol() + " Ten cong ty: " + getCompanyName() + " Gia co phieu: " + getPrice() + " Khoi luong giao dich: " + getVolume());
    }
    public void updatePrice(double newPrice) {
        System.out.println("Gia co phieu duoc cap nhat thanh: "+ newPrice);
    }
}
