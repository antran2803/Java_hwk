import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Stock> stocks= new ArrayList<>();
        Stock st1 = new Stock("Dt123", "A", 135.283, 10);
        Stock st2 = new Stock("Dt125", "B", 635.283, 50);
        Stock st3 = new Stock("Dt127", "C", 420.283, 140);
        PreferredStock cophieukm= new PreferredStock("Dt127", "C", 420.283, 140);
        CommonStock cophieuthuong= new CommonStock("Dt125", "B", 635.283, 50);
        stocks.add(st1);
        stocks.add(st2);
        stocks.add(st3);
        stocks.add(cophieuthuong);
        stocks.add(cophieukm);
        System.out.println( st1.getVolume());
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ty le lai suat hang nam: ");
        float rate = sc.nextFloat();
        cophieukm.annualDividendRate(rate);
        for(Stock stock: stocks) {
            stock.displayInfo();
        }
        Investor inv1 =new Investor("312Bef","Nguyen Van A");
        Investor inv2 =new Investor("312Bef","Nguyen Thi Be");

        inv1.buyStock(st1,10);
        inv2.buyStock(st2,15);
        inv1.sellStock(st1,5);
        inv1.displayInfo();
        inv2.sellStock(st1,10);
        inv2.displayInfo();
    }
}