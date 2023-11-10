package FinalProject;

public class Pasta extends DishesDecorator{
    public Pasta(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", pasta";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.8;
    }
}
