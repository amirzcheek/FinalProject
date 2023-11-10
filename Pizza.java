package FinalProject;

public class Pizza extends DishesDecorator{
    public Pizza(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", pizza";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.6;
    }
}
