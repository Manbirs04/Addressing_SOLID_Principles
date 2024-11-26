module com.example.addressing_solid_principles {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.addressing_solid_principles to javafx.fxml;
    exports com.example.addressing_solid_principles;
}