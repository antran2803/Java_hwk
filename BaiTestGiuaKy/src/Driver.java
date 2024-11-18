import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Driver extends User {
    private String status;
    public Driver(){}
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
    public void updateOKStatus() {
        System.out.println("-------------------------------------------------------------");
        this.status = "ok";
        System.out.println("Tai xe cap nhat trang thai san sang nhan cuoc xe");
        System.out.println("-------------------------------------------------------------");
    }
    public void updateNotStatus() {
        System.out.println("-------------------------------------------------------------");
        this.status = "not";
        System.out.println("tai xe cap nhat trang thai dang co cuoc xe");
        System.out.println("-------------------------------------------------------------");
    }
    public void acceptRide(Ride ride) {
        System.out.println("-------------------------------------------------------------");
        if(status == "ok") {
            ride.setDriver(this);
            ride.setStatus("dang xu ly");
            HisRides.add(ride);
            System.out.println("tai xe dong y chuyen xe ten la " + this.getName());
            this.updateNotStatus();
            System.out.println("-------------------------------------------------------------");
        }
        else {
            System.out.println("-------------------------------------------------------------");
            System.out.println("tai xe dang thuc hien chuyen xe khac");
            System.out.println("-------------------------------------------------------------");
        }
    }
    public List<Ride> getHisRides() {
        return HisRides;
    }
}