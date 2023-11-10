package FinalProject;

public class Borsch extends DishesDecorator{
    public Borsch(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", borsch";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.7;
    }
}
