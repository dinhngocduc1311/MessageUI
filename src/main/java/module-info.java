module com.example.messageui {
    requires javafx.controls;
    requires javafx.fxml;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.messageui to javafx.fxml;
    exports com.example.messageui;
}