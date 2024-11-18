public class GeneralCheckup extends MedicalService {
    public GeneralCheckup(String serviceID, String serviceName, double cost) {
        super(serviceID, serviceName, cost);
    }
    @Override
    public void requireTime() {
        System.out.print("Thoi gian lam viec kham tong quat tu 7:00 - 15:00 ");
    }

    @Override
    public void Cost() {
        System.out.println("Chi phi kham tong quat: "+ this.getCost());

    }
}
