package cse213.group44movieproductionhousee.homaira;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;





public class LoginFxmlController {

    @FXML
    private TextField UserTF;

    @FXML
    private PasswordField PasswordPF;

    @FXML
    private void SearchOA() {
        String username = UserTF.getText();
        String password = PasswordPF.getText();

        if (username.isEmpty() || password.isEmpty()) {
            showAlert("Error", "Please fill in all fields.");
        } else if (username.equalsIgnoreCase("production manager") && password.equals("6 digit password")) {
            showAlert("Login Successful", "Welcome Production Manager!");
        } else if (username.equalsIgnoreCase("marketing manager") && password.equals("4 digit password")) {
            showAlert("Login Successful", "Welcome Marketing Manager!");
        } else {
            showAlert("Login Failed", "Invalid username or password.");
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }


    public TextField getUserTF() {
        return UserTF;
    }

    public void setUserTF(TextField userTF) {
        UserTF = userTF;
    }




    public PasswordField getPasswordPF() {
        return PasswordPF;
    }

    public void setPasswordPF(PasswordField passwordPF) {
        PasswordPF = passwordPF;
    }

    @Override
    public String toString() {
        return "LoginFxmlController{" +
                "UserTF=" + UserTF +
                ", PasswordPF=" + PasswordPF +
                '}';
    }
}



