package cse213.group44movieproductionhousee.homaira;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class MarketingManagerFxmlController {


    public TextField MovieTitleTF;


    public TextField CampaignTypeTF;


    public TextField ReleaseDateTF;


    @FXML
    private void CreateCampaignOA() {
        String movieTitle = MovieTitleTF.getText();
        String campaignType = CampaignTypeTF.getText();

        if (movieTitle.isEmpty() || campaignType.isEmpty()) {
            showAlert("Error", "Please enter both Movie Title and Campaign Type.");
        } else {
            showAlert("Campaign Created",
                    "Campaign for '" + movieTitle + "' (" + campaignType + ") has been created successfully.");
        }
    }



    @FXML
    private void ScheduleReleaseOA() {
        String movieTitle = MovieTitleTF.getText();
        String releaseDate = ReleaseDateTF.getText();

        if (movieTitle.isEmpty() || releaseDate.isEmpty()) {
            showAlert("Error", "Please enter both Movie Title and Release Date.");
        } else {
            showAlert("Release Scheduled",
                    "The movie '" + movieTitle + "' has been scheduled for release on " + releaseDate + ".");
        }
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
        return "MarketingManagerFxmlController{" +
                "MovieTitleTF=" + MovieTitleTF +
                ", CampaignTypeTF=" + CampaignTypeTF +
                ", ReleaseDateTF=" + ReleaseDateTF +
                '}';
    }
}
