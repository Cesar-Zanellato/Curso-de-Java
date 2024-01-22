package estudando.olamundojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    private Label lbMensagem;
    private Button btnClick;
    
    @FXML
    private void clicouBotao(ActionEvent event){
        lbMensagem.setText("Hello World");
    }
}
