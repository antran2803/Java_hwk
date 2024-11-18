import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        fullTime fT = new fullTime(35.300, 100.145, 5, 18);
        freeLancer fL = new freeLancer(145, 100, 139.7);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap cac du an hien tai: ");
        int n = sc.nextInt();
        n-=1;
        fL.setCurrentProjects(n);
        System.out.print("Cac du an da luu: ");
        fL.getCurrentProjects();
        System.out.println("Thong tin co ban cua FreeLancer: ");
        System.out.println(fL.getPersonalInfo());
        System.out.print("Cong viec cua fullTime: ");
        fT.doWork();

    }
}
