package FinalProject;

public abstract class CuisineFactory {
    private Cuisine cuisine = createCuisine();

    public Cuisine getCuisine() {
        return cuisine;
    }

    public void setCuisine(Cuisine dish) {
        cuisine = dish;
    }

    public abstract Cuisine createCuisine();
}
