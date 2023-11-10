package FinalProject;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {

    private static RestaurantManager instance;
    private PayStrategy payStrategy;

    private List<Customer> customers;
    private List<Observer> customersWithNotifications;

    private RestaurantManager() {
        customers = new ArrayList<>();
        customersWithNotifications = new ArrayList<>();
    }

    public static RestaurantManager getInstance() {
        if (instance == null) {
            instance = new RestaurantManager();
        }
        return instance;
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void showCustomers(){
        customers.stream().forEach(System.out::println);
    }

    public void showCustomersWithNotifications(){
        customersWithNotifications.stream().forEach(System.out::println);
    }

    public void removeCustomer(int id){
        customers.remove(id);
    }

    public void addCustomerWithNotifications(Customer customer) {
        customersWithNotifications.add(customer);
    }

    public void removeCustomerWithNotifications(int id){
        customersWithNotifications.remove(id);
    }

    public void notifyCustomers(String message) {
        for (Observer observer: customersWithNotifications) {
            observer.update(message);
        }
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void pay(double amount, String currency) {
        payStrategy.pay(amount, currency);
    }

}
