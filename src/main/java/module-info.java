module com.example.eventsfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.eventsfx to javafx.fxml;
    exports com.example.eventsfx;
}