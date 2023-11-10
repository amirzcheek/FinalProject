package FinalProject;

public class TengeCurrencyAdapter implements TengeCurrency{
    DollarsCurrency dollarsCurrency;

    public TengeCurrencyAdapter(DollarsCurrency dollarsCurrency) {
        this.dollarsCurrency = dollarsCurrency;
    }

    @Override
    public double getAmountInTenge() {
        return dollarsCurrency.getAmount() * 468.75;
    }

    @Override
    public String getInfo() {
        return "tenge";
    }
}
