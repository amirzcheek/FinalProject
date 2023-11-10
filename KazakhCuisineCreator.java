package FinalProject;

public class KazakhCuisineCreator extends CuisineFactory{
    @Override
    public Cuisine createCuisine() {
        return new KazakhCuisine();
    }
}
