
public class Main {
    public static void main(String[] args) {
        RocketA tenlua1 = new RocketA();
        RocketB tenlua2 = new RocketB();
        RocketC tenlua3 = new RocketC();
        Launcher bd = new Launcher();
        System.out.println("Khoi dong Rocket A: ");
        bd.launchRocket(tenlua1);
        System.out.println("Khoi dong Rocket B: ");
        bd.launchRocket(tenlua2);
        System.out.println("Khoi dong Rocket C: ");
        bd.launchRocket(tenlua3);
    }
}