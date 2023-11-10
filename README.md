# SDP-FinalProject
SDP Final Project
Created by **Ilya Shelestov** and **Amirkhan Ilyassov**

Our Project idea is a **SmartRestaurant Management System**.

**Overview**
The SmartRestaurant Management System is a Java-based application that simulates the management operations of a restaurant. It utilizes various design patterns to enhance modularity, extensibility, and maintainability of the codebase. The implemented design patterns include Singleton, Decorator, Adapter, Factory Method, Observer, and Strategy.

**Design Patterns Overview**

1. **Singleton Pattern**
The Singleton pattern is implemented in the **RestaurantManager** class of the SmartRestaurant Management System. The class ensures that only one instance of the manager exists throughout the system. The private constructor prevents external instantiation, and the **getInstance** method provides access to the single instance. This guarantees centralized control over resources such as customer data, payment strategies, and notifications, enhancing overall system coherence and efficiency.

2. **Decorator Pattern**
The Decorator pattern is utilized to dynamically modify the cost and description of menu items in the SmartRestaurant Management System. The **DishesDecorator** abstract class implements the Cuisine interface, providing a base decorator structure. Concrete decorators, such as **Besbarmak**, **Borsch**, **Kespe**, **Okroshka**, **Pasta**, and **Pizza**, extend **DishesDecorator** to add specific dishes to the base **Cuisine**. Each decorator contributes to the final cost and description of the menu item, allowing customers to customize their orders with additional dishes.

3. **Adapter Pattern**
The Adapter pattern is used to handle different currencies during the payment process. Users choose between dollars and tenge. If tenge is selected, the **TengeCurrencyAdapter** seamlessly converts the currency amount from dollars to tenge. This adaptation ensures compatibility between the existing **DollarsCurrency** class and the rest of the payment system, promoting flexibility for future currency additions with minimal code changes.

4. **Factory Method Pattern**
The Factory Method pattern is employed in the SmartRestaurant Management System to create different types of cuisines dynamically. The **CuisineFactory** abstract class serves as the base factory, providing a common interface for creating cuisines. Concrete factories, such as **ItalianCuisineCreator**, **KazakhCuisineCreator**, and **RussianCuisineCreator**, extend **CuisineFactory**. Each concrete factory overrides the **createCuisine** method to instantiate a specific type of cuisine, such as **ItalianCuisine**, **KazakhCuisine**, or **RussianCuisine**.

5. **Observer Pattern**
The Observer pattern is implemented to notify customers who have subscribed to notifications. In this system, customers act as observers. Customers subscribe to notifications and are notified when an event happening or amount of available tables. The Observer pattern ensures that only interested customers receive updates, enhancing the efficiency of the waiting system.

6. **Strategy Pattern**
The Strategy pattern in the SmartRestaurant Management System enables customers to dynamically choose their payment method. When prompted, users select between Kaspi and Steam. The chosen payment strategy, either **PayByKaspi** or **PayBySteam**, is then employed to execute the payment operation. This design allows for easy expansion of payment options in the future, enhancing system flexibility.


**Usage**

**Administrator Mode**
1. Add, remove, or view customers.
2. Add or remove customers with notifications.
3. Send messages to customers.

**Customer Mode**
1. Enter personal details.
2. Choose to receive notifications.
3. Select a cuisine (Kazakh, Russian, Italian).
4. Customize the order with the Decorator pattern.
5. Choose the payment currency with the Adapter pattern.
6. Select the payment method with the Strategy pattern.
