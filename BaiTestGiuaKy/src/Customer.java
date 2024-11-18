import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Customer extends User {
    public Customer(){}
    private List<Ride> HisRides = new ArrayList<>();
    public void signUp() {
        System.out.println("-------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: "); String name = sc.nextLine();
        System.out.print("Enter phone number: "); String phoneNumber = sc.nextLine();
        System.out.print("Enter user account: "); String userAccount = sc.nextLine();
        System.out.print("Enter password: "); String password = sc.nextLine();

        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.setUserAccount(userAccount);
        this.setPassword(password);
        this.setUserID(phoneNumber);
        System.out.println("-------------------------------------------------------------");
    }
    public Ride bookRide() {
        System.out.println("-------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Khach Hang book xe");
        System.out.println("nhap dia diem don: "); String pickupLocation = sc.nextLine();
        System.out.println("nhap dia diem dich: "); String destination = sc.nextLine();
        Ride ride = new Ride(this, pickupLocation, destination);
        ride.setStatus("chua duoc nhan");
        HisRides.add(ride);
        System.out.println("chuyen xe tu " + pickupLocation + " den " + destination);
        System.out.println("-------------------------------------------------------------");
        return ride;
    }
    public List<Ride> getHisRides() {
        return HisRides;
    }

}