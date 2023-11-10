package FinalProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RestaurantManager restaurantManager = RestaurantManager.getInstance();

        int choice;
        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("Who are you?");
            System.out.println("1 - Administrator.");
            System.out.println("2 - Customer.");
            System.out.println("Else - Back.");
            System.out.println("--------------------------------------");
            choice = scanner.nextInt();
            if (choice == 1) {
                while (true) {
                    System.out.println("--------------------------------------");
                    System.out.println("1 - Add customer.");
                    System.out.println("2 - Remove customer.");
                    System.out.println("3 - List of customer.");
                    System.out.println("4 - Add customer with notification.");
                    System.out.println("5 - Remove customer with notification.");
                    System.out.println("6 - List of customer with notification.");
                    System.out.println("7 - Send message to customers.");
                    System.out.println("Else - back.");
                    System.out.println("--------------------------------------");
                    choice = scanner.nextInt();
                    if (choice == 1) {
                        System.out.println("Write customer's name:");
                        String name = scanner.next();
                        System.out.println("Write customer's number:");
                        String number = scanner.next();
                        Customer customer = new Customer(name, number);
                        restaurantManager.addCustomer(customer);
                    }
                    else if (choice == 2) {
                        System.out.println("Write customer's id:");
                        int id = scanner.nextInt();
                        restaurantManager.removeCustomer(id);
                    }
                    else if (choice == 3) {
                        restaurantManager.showCustomers();
                    }
                    else if (choice == 4) {
                        System.out.println("Write customer's name:");
                        String name = scanner.next();
                        System.out.println("Write customer's number:");
                        String number = scanner.next();
                        Customer customer = new Customer(name, number);
                        restaurantManager.addCustomerWithNotifications(customer);
                    }
                    else if (choice == 5) {
                        System.out.println("Write customer's id:");
                        int id = scanner.nextInt();
                        restaurantManager.removeCustomerWithNotifications(id);
                    }
                    else if (choice == 6) {
                        restaurantManager.showCustomersWithNotifications();
                    }

                    //NOTIFICATIONS.

                    else if (choice == 7) {
                        System.out.println("Write a message to customers:");
                        scanner.nextLine();
                        String message = scanner.nextLine();
                        restaurantManager.notifyCustomers(message);
                    }
                    else  {
                        break;
                    }
                }
            }
            else if (choice == 2) {
                System.out.println("--------------------------------------");
                System.out.println("Good day! Please, enter your name:");
                System.out.println("--------------------------------------");
                String name = scanner.next();
                System.out.println("Please, enter your phone number:");
                String number = scanner.next();
                Customer customer = new Customer(name, number);
                restaurantManager.addCustomer(customer);
                System.out.println("Do you want to receive notifications? y/n.");
                String choiceString = scanner.next();
                if (choiceString.equals("y")) {
                    restaurantManager.addCustomerWithNotifications(customer);
                }

                //FACTORY AND DECORATOR.

                System.out.println("What cuisine you want to choose today? 1 - Kazakh, 2 - Russian, 3 - Italian.");
                CuisineFactory cuisine;
                choice = scanner.nextInt();
                String doneChoice;
                if (choice == 1) {
                    cuisine = new KazakhCuisineCreator();
                    do {
                        System.out.println("Choose dishes:");
                        System.out.println("1 - Besbarmak.");
                        System.out.println("2 - Kespe.");
                        choice = scanner.nextInt();
                        if (choice == 1) {
                            cuisine.setCuisine(new Besbarmak(cuisine.getCuisine()));
                        }
                        else {
                            cuisine.setCuisine(new Kespe(cuisine.getCuisine()));
                        }
                        System.out.println("Are you done? y/n.");
                        doneChoice = scanner.next();
                    } while  (doneChoice.equals("n"));
                }
                else if (choice == 2) {
                    cuisine = new RussianCuisineCreator();
                    do {
                        System.out.println("Choose dishes:");
                        System.out.println("1 - Borsch.");
                        System.out.println("2 - Okroshka.");
                        choice = scanner.nextInt();
                        if (choice == 1) {
                            cuisine.setCuisine(new Borsch(cuisine.getCuisine()));
                        }
                        else {
                            cuisine.setCuisine(new Okroshka(cuisine.getCuisine()));
                        }
                        System.out.println("Are you done? y/n.");
                        doneChoice = scanner.next();
                    } while  (doneChoice.equals("n"));
                }
                else {
                    cuisine = new ItalianCuisineCreator();
                    do {
                        System.out.println("Choose dishes:");
                        System.out.println("1 - Pasta.");
                        System.out.println("2 - Pizza.");
                        choice = scanner.nextInt();
                        if (choice == 1) {
                            cuisine.setCuisine(new Pasta(cuisine.getCuisine()));
                        }
                        else {
                            cuisine.setCuisine(new Pizza(cuisine.getCuisine()));
                        }
                        System.out.println("Are you done? y/n");
                        doneChoice = scanner.next();
                    } while  (doneChoice.equals("n"));
                }

                String description = cuisine.getCuisine().getDescription();
                double cost = cuisine.getCuisine().getCost();

                System.out.println("Your order: ");
                System.out.println(description);

                System.out.println("Your total price: ");
                System.out.println(cost);

                //ADAPTER.

                System.out.println("Are you paying in dollars or tenge? 1 - Dollars, 2 - Tenge.");
                choice = scanner.nextInt();
                DollarsCurrency dollarsCurrency = new DollarsCurrency(cost);
                String currencyDisc = dollarsCurrency.getInfo();
                if (choice == 2) {
                    TengeCurrencyAdapter tengeCurrency = new TengeCurrencyAdapter(dollarsCurrency);
                    cost = tengeCurrency.getAmountInTenge();
                    currencyDisc = tengeCurrency.getInfo();
                }

                //STRATEGY.

                System.out.println("What will be your payment method? 1 - Kaspi, 2 - Steam.");
                choice = scanner.nextInt();
                if (choice == 1) {
                    restaurantManager.setPayStrategy(new PayByKaspi());
                    restaurantManager.pay(cost, currencyDisc);
                }
                else {
                    restaurantManager.setPayStrategy(new PayBySteam());
                    restaurantManager.pay(cost, currencyDisc);
                }
                System.out.println("Thank you for being with us!");
            }
            else {
                break;
            }
        }
    }
}
