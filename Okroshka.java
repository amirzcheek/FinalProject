package FinalProject;

public class Okroshka extends DishesDecorator{
    public Okroshka(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", okroshka";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}
