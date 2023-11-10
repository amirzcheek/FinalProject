package FinalProject;

public class ItalianCuisineCreator extends CuisineFactory{
    @Override
    public Cuisine createCuisine() {
        return new ItalianCuisine();
    }
}
