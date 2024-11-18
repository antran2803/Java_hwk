import java.util.Scanner;

public class PreferredStock extends Stock{
    public PreferredStock(String symbol, String companyName, double price, int volume) {
        super(symbol, companyName, price, volume);
    }

    public void annualDividendRate(float rate) {
       double PriceWithRate= getPrice()*(rate/100);
        System.out.println("So tien lai nhan duoc: "+ PriceWithRate+ " voi so tien goc la: "+getPrice());
    }
    @Override
    public void displayInfo() {
        System.out.println("Day la co phieu co khuyen mai.");
    }
}
