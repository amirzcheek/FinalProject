package FinalProject;

public class KazakhCuisine implements Cuisine {
    @Override
    public String getDescription() {
        return "Serving Kazakh food";
    }

    @Override
    public double getCost() {
        return 1.00;
    }
}
