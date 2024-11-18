
public class Chef extends Customer implements  MenuManagement {
    public Chef(String name, String phoneNumber, String address) {
        super(name, phoneNumber, address);
    }

    @Override
    public void addMenuItem(MenuItem Item) {
        System.out.println("Ten mon an vua duoc cap nhat: "+ getName());
    }

    @Override
    public void removeMenuItem(MenuItem Item) {
        System.out.println("Dau bep khong the thuc hien chuc nang nay!");
    }

    @Override
    public void updateMenuItem(MenuItem oldItem, MenuItem newItem) {
        System.out.println("Mon an cu la: "+ oldItem.getNameFood() +" da duoc chuyen thanh mon moi: "+ newItem.getNameFood());
    }
}
