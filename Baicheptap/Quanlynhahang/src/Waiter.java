public class Waiter extends Customer implements MenuManagement {

    public Waiter(String name, String phoneNumber, String address) {
        super(name, phoneNumber, address);
    }

    @Override
    public void addMenuItem(MenuItem Item) {
        System.out.println("Do an duoc them boi nhan vien: "+ Item.getNameFood());
    }

    @Override
    public void removeMenuItem(MenuItem Item) {
        System.out.println("Mon an da duoc nhan vien xoa: "+ Item.getNameFood());
    }

    @Override
    public void updateMenuItem(MenuItem oldItem, MenuItem newItem) {
        System.out.println("Nhan vien khong the thuc hien chuc nang nay!");
    }
}
