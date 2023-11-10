package FinalProject;

public class PayBySteam implements PayStrategy{
    @Override
    public void pay(double amount, String currency) {
        System.out.println("Payed " + amount + " " + currency + " with Steam");
    }
}
