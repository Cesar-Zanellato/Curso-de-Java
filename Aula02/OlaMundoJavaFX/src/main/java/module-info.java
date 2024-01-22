module estudando.olamundojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens estudando.olamundojavafx to javafx.fxml;
    exports estudando.olamundojavafx;
}
