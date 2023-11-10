package FinalProject;

public abstract class DishesDecorator implements Cuisine{
    Cuisine Cuisine;

    public DishesDecorator(Cuisine cuisine) {
        this.Cuisine = cuisine;
    }

    @Override
    public String getDescription() {
        return Cuisine.getDescription();
    }

    @Override
    public double getCost() {
        return Cuisine.getCost();
    }
}
