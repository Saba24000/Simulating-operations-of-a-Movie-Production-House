module cse213.group44movieproductionhousee {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.group44movieproductionhousee to javafx.fxml;
    opens cse213.group44movieproductionhousee.Saba to javafx.fxml, javafx.base;
    exports cse213.group44movieproductionhousee.homaira to javafx.fxml, javafx.base;
}