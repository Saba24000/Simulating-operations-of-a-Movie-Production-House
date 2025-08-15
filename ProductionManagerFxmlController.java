package cse213.group44movieproductionhousee.homaira;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class ProductionManagerFxmlController {

    public TextField MovieTitleTF;

    public TextField getMovieTitleTF() {
        return MovieTitleTF;
    }

    public void setMovieTitleTF(TextField movieTitleTF) {
        MovieTitleTF = movieTitleTF;
    }

    public TextField BudgetTF;

    public TextField getBudgetTF() {
        return BudgetTF;
    }

    public void setBudgetTF(TextField budgetTF) {
        BudgetTF = budgetTF;
    }

    public void NewMovieOA(ActionEvent actionEvent) {
    }

    public void ProductionOA(ActionEvent actionEvent) {
    }


    @FXML
    private void NewMovieOA() {
        String movieTitle = MovieTitleTF.getText();
        String budget = BudgetTF.getText();

        if (movieTitle.isEmpty() || budget.isEmpty()) {
            showAlert("Error", "Please enter both Movie Title and Budget.");
        } else {
            // Create a ProductionManager object and simulate starting a movie project
            ProductionManager manager = new ProductionManager();
            manager.startNewMovie(movieTitle, budget);
            showAlert("Movie Project Created",
                    "New movie '" + movieTitle + "' with budget " + budget + " has been started.");
        }
    }


    @FXML
    private void ProductionOA() {
        // Here you could load another scene to view production details
        showAlert("Production View", "Displaying production details (to be implemented).");
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @Override
    public String toString() {
        return "ProductionManagerFxmlController{" +
                "MovieTitleTF=" + MovieTitleTF +
                ", BudgetTF=" + BudgetTF +
                '}';
    }
}

