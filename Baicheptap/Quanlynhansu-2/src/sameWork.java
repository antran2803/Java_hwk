public abstract class sameWork {
    protected String name;
    protected int ID;
    protected String email;

    public sameWork(String name, String email, int ID) {
        this.name = name;
        this.email = email;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void doWork();
    public abstract double calculateSalary();
    public abstract  String getPersonalInfo();
}
