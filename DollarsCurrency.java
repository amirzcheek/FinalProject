package FinalProject;

public class DollarsCurrency {
    private double amount;

    public DollarsCurrency(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String getInfo() {
        return "dollars";
    }
}
