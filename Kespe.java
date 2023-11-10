package FinalProject;

public class Kespe extends DishesDecorator{
    public Kespe(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", kespe";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}
