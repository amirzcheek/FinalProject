package FinalProject;

public class RussianCuisineCreator extends CuisineFactory{
    @Override
    public Cuisine createCuisine() {
        return new RussianCuisine();
    }
}
