import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



   public class Main {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           Customer customer = new Customer();
           Driver driver = new Driver();

           System.out.println("Welcome to the Ride Booking System!");

           // Sign up Customer
           System.out.println("Customer Sign Up:");
           customer.signUp();

           // Sign up Driver
           System.out.println("Driver Sign Up:");
           driver.signUp();

           boolean exit = false;
           while (!exit) {
               System.out.println("Choose an option:");
               System.out.println("1. Customer books a ride");
               System.out.println("2. Driver updates status to 'Ready'");
               System.out.println("3. Driver accepts ride");
               System.out.println("4. Show Customer's ride history");
               System.out.println("5. Show Driver's ride history");
               System.out.println("6. Exit");
               System.out.print("Enter your choice: ");

               int choice = sc.nextInt();
               sc.nextLine(); // Consume newline

               switch (choice) {
                   case 1:
                       Ride ride = customer.bookRide();
                       System.out.println("Ride booked successfully.");
                       break;
                   case 2:
                       driver.updateOKStatus();
                       System.out.println("Driver status updated to 'Ready'.");
                       break;
                   case 3:
                       if (!customer.getHisRides().isEmpty()) {
                           ride = customer.getHisRides().get(0); // Assuming customer has at least one ride
                           driver.acceptRide(ride);
                           System.out.println("Ride accepted by the driver.");
                       } else {
                           System.out.println("No rides available for the driver to accept.");
                       }
                       break;
                   case 4:
                       System.out.println("Customer's Ride History:");
                       for (Ride r : customer.getHisRides()) {
                           r.displayRideInfo();
                       }
                       break;
                   case 5:
                       System.out.println("Driver's Ride History:");
                       for (Ride r : driver.getHisRides()) {
                           r.displayRideInfo();
                       }
                       break;
                   case 6:
                       System.out.println("Exiting...");
                       exit = true;
                       break;
                   default:
                       System.out.println("Invalid choice. Please try again.");
                       break;
               }
           }

           sc.close();
       }
}