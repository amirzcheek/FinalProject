package FinalProject;

public class Customer implements Observer{
    private String name;
    private String number;

    public Customer(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for " + name + " (" + number + "): " + message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "name = " + name + ", number = " + number;
    }
}
