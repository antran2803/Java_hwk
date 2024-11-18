public abstract class MedicalService {
    private String serviceID;
    private String serviceName;
    private double cost;

    public MedicalService(String serviceID, String serviceName, double cost) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.cost = cost;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    public abstract void requireTime();

    public abstract void Cost();
}
