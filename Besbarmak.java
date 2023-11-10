package FinalProject;

public class Besbarmak extends DishesDecorator{
    public Besbarmak(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", besbarmak";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.8;
    }
}
