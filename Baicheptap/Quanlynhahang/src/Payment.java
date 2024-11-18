public interface Payment {
    public void PaymentMethod(double amount);
}
class CashPayment implements Payment {

    @Override
    public void PaymentMethod(double amount) {
        System.out.println("Tra tien bang tien mat voi so tien la: "+ amount);
    }
}

class CreditCardPayment implements Payment {
    @Override
    public void PaymentMethod(double amount) {
        System.out.println("Tra tien bang the tin dung voi so tien la: "+ amount);
    }
}