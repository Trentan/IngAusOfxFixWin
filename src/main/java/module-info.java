module ofx {
    requires javafx.controls;
    requires javafx.fxml;

    //requires java.util.logging.Level;
    requires java.logging;
    requires java.xml;

    opens org.openjfx to javafx.fxml;
    exports org.openjfx;
}