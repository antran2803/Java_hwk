import java.util.ArrayList;

public class Investor {
    private String investorID;
    private String name;
    private ArrayList<StockHolding> portfolio;

    public Investor(String investorID, String name) {
        this.investorID = investorID;
        this.name = name;
        this.portfolio = new ArrayList<>();
    }

    //Tom tat chuc nang ban la duyet het danh sach cua portfolio
    // neu trong StockHolding co trung co phieu do
    //thi cong don vao cho quantity
    //con chua co thi tao 1 porfolio moi
    public void buyStock(Stock stock, int quantity) {
        for (StockHolding Sh : portfolio) {
            if (Sh.getStock().equals(stock)) {
                Sh.setQuantity(Sh.getQuantity() + quantity);
            }
        }
        portfolio.add(new StockHolding(stock, quantity));
    }
    //Tom tat chuc nang mua la duyet het danh sach cua portfolio
    //Neu trong StockHolding  co trung co phieu do
    //thi gan 1 index cho co phieu trung do
    //Neu bang thi tru di so luong lay ra va neu so luong lay ra
    //Tru di bang 0 thi xoa cai Portfolio do di
    //Neu ko du thi xuat ra output va ko co cx tuong tu
    public void sellStock(Stock stock, int quantity) {
        for (StockHolding Sh : portfolio) {
            if (Sh.getStock().equals(stock)) {
                int currentQuantity = Sh.getQuantity();
                if (currentQuantity >= quantity) {
                    Sh.setQuantity(currentQuantity - quantity);
                }
                if (currentQuantity == 0) {
                    portfolio.remove(Sh);
                }
            } else {
                System.out.println("Khong du so luong co phieu de ban");
            }
            System.out.println("Khong tim thay loai co phieu "+ Sh.getStock().symbol);
        }

    }

    public void displayInfo() {
        System.out.println("Danh mục cổ phiếu hien tai của nha dau tu " + name + ":");
        for (StockHolding Sh : portfolio) {
            System.out.println("Cổ phiếu : " + Sh.getStock().symbol + " - Số lượng: " + Sh.getQuantity());
        }
    }
}
