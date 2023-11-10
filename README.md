# SDP-FinalProject
SDP Final Project
Created by Ilya Shelestov and Amirkhan Ilyassov

Our Project idea is a **Restaurant**. In this project, we have implemented 6 Design Patterns: Strategy, Decorator, Singleton, Adapter, Factory method and Observer.

**Design Patterns Overview**
1. Singleton Pattern
The RestaurantManager class is implemented using the Singleton pattern to ensure a single instance controls the entire restaurant. This ensures centralized management and access to critical resources.

2. Decorator Pattern
The Decorator pattern is applied to menu items, allowing customers to customize their orders with add-ons and modifications. Additional features such as CheeseDecorator and VegetableDecorator can be dynamically added to menu items.

3. Adapter Pattern
The Adapter pattern integrates various payment gateways into the billing system. Adapters are created for payment gateways like PayPal and Credit Card to make them compatible with the existing billing system.

4. Factory Method Pattern
The Factory Method pattern is employed to create different cuisines with specialized cooking procedures. Concrete factories such as ItalianCuisineFactory and ChineseCuisineFactory create specific dishes like Pizza, Pasta, and Dumplings.

5. Observer Pattern
The Observer pattern is implemented to notify customers waiting for a table. Customers act as observers, and the TableManager class serves as a subject, notifying waiting customers when a table becomes available.

6. Strategy Pattern
The Strategy pattern is applied in the discount system, where different discount strategies (e.g., PercentageDiscount, FixedAmountDiscount) can be dynamically switched based on customer type or ongoing promotions.
