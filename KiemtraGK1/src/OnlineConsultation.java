public abstract class OnlineConsultation extends MedicalService{
    public OnlineConsultation(String serviceID, String serviceName, double cost) {
        super(serviceID, serviceName, cost);
    }
    @Override
    public void requireTime() {
        System.out.println("Thoi gian lam viec kham tong quat tu 6:00 - 12:00");
    }

    @Override
    public void Cost() {
        System.out.println("Chi phi tu van truc tiep:" + this.getCost());
    }
}
