public class fullTime extends sameWork {
    private int days, availableLeaveDays;
    private double baseSalary, allowances;

    public fullTime(double allowances, double baseSalary, int availableLeaveDays, int days) {
        super("Nguyen Van A", "T1number1@gmail.com", 0001);
        this.allowances = allowances;
        this.baseSalary = baseSalary;
        this.availableLeaveDays = availableLeaveDays;
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getAllowances() {
        return allowances;
    }

    public void setAllowances(double allowances) {
        this.allowances = allowances;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getAvailableLeaveDays() {
        return availableLeaveDays;
    }

    public void setAvailableLeaveDays(int availableLeaveDays) {
        this.availableLeaveDays = availableLeaveDays;
    }

    public double calculateSalary() {
        return baseSalary + allowances;
    }

    @Override
    public String getPersonalInfo() {
        return this.name + this.ID + this.email ;
    }

    public boolean requestLeave(int days) {
        if( availableLeaveDays >= days) {
            availableLeaveDays -= days;
            return true;
        }
        else {
            return false;
        }
    }
    public String evaluatePerformance() {
        if(days > availableLeaveDays && availableLeaveDays < 3){
            return "Excellent";
        }
        return "Not enough Target";
    }
    public void doWork(){
        System.out.println("Fulltime");
    }
}
