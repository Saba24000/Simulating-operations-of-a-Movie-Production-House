package cse213.group44movieproductionhousee.homaira;

public class ProductionManager {
    private String movieTitle;
    private float budget;


    public ProductionManager() {
        this.movieTitle = movieTitle;

    }



    public void startNewMovie(String movieTitle, String budget) {
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    @Override
    public String toString() {
        return "ProductionManager{" +
                "movieTitle='" + movieTitle + '\'' +
                ", budget=" + budget +
                '}';
    }


}
