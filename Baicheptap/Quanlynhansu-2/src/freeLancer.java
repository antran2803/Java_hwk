import java.util.ArrayList;
import java.util.Scanner;
public class freeLancer extends sameWork {
    private int hoursWorked;
    private double hourlyRate;
    private int hours;
    private ArrayList<String> currentProjects;

    public freeLancer(int hoursWorked, int hours, double hourlyRate) {
        super("Tran Van B", "Btc2@gmail.com",0101);
        this.hoursWorked = hoursWorked;
        this.hours = hours;
        this.hourlyRate = hourlyRate;
        this.currentProjects= new ArrayList<>();
    }

    public void getCurrentProjects() {
        for(int i=0; i< currentProjects.size();i++) {
            System.out.println(currentProjects.get(i)+ " ");
        }
    }

    public void setCurrentProjects(String project) {
        this.currentProjects.add(project);
    }

    Scanner sc= new Scanner(System.in);

    public void setCurrentProjects(int numberProject) {
        for(int i=0; i< numberProject;i++) {
            String str =sc.nextLine();
            currentProjects.add(str);

        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String getPersonalInfo() {
        return this.name +" - "+ this.ID+" - "+ this.email;
    }

    public void receiveProject(String projectName) {
        currentProjects.add(projectName);
    }

    public void completeProject(String projectName) {
        currentProjects.remove(projectName);
    }

    public void trackWorkHours(int hours) {
        int totalWorkedHours=0;
        totalWorkedHours+= hours;
    }

    public void doWork() {
        System.out.println("Freelancer");
    }

}
