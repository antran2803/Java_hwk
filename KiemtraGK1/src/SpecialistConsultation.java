public class SpecialistConsultation extends MedicalService{

    public SpecialistConsultation(String serviceID, String serviceName, double cost) {
        super(serviceID, serviceName, cost);
    }

    @Override
    public void requireTime() {
        System.out.println("Thoi gian lam viec kham tong quat tu 9:00 - 22:00");
    }

    @Override
    public void Cost() {
        System.out.println("Chi phi kham chuyen khoa: "+ this.getCost());
    }
}
