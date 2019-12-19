package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class SeatSelection implements Initializable {

    private ArrayList<Label> seatList = new ArrayList<Label>();


    @FXML
    private GridPane seat13;

    @FXML
    private Label seatA1;

    @FXML
    private Label seatA2;

    @FXML
    private Label seatA3;

    @FXML
    private Label seatA5;

    @FXML
    private Label seatA6;

    @FXML
    private Label seatA7;

    @FXML
    private Label seatA4;

    @FXML
    private Label seatA8;

    @FXML
    private Label seatA12;

    @FXML
    private Label seatA11;

    @FXML
    private Label seatA10;

    @FXML
    private Label seatA9;

    @FXML
    private Label seatB12;

    @FXML
    private Label seatB11;

    @FXML
    private Label seatB10;

    @FXML
    private Label seatB9;

    @FXML
    private Label seatB8;

    @FXML
    private Label seatB7;

    @FXML
    private Label seatB6;

    @FXML
    private Label seatB5;

    @FXML
    private Label seatB4;

    @FXML
    private Label seatB3;

    @FXML
    private Label seatB2;

    @FXML
    private Label seatB1;

    @FXML
    private Label seatC12;

    @FXML
    private Label seatC11;

    @FXML
    private Label seatC10;

    @FXML
    private Label seatC9;

    @FXML
    private Label seatC8;

    @FXML
    private Label seatC7;

    @FXML
    private Label seatC6;

    @FXML
    private Label seatC5;

    @FXML
    private Label seatC4;

    @FXML
    private Label seatC3;

    @FXML
    private Label seatC2;

    @FXML
    private Label seatC1;

    @FXML
    private Label seatD12;

    @FXML
    private Label seatD11;

    @FXML
    private Label seatD10;

    @FXML
    private Label seatD9;

    @FXML
    private Label seatD8;

    @FXML
    private Label seatD7;

    @FXML
    private Label seatD6;

    @FXML
    private Label seatD5;

    @FXML
    private Label seatD4;

    @FXML
    private Label seatD3;

    @FXML
    private Label seatD2;

    @FXML
    private Label seatD1;

    @FXML
    private Label seatG2;

    @FXML
    private Label seatG1;

    @FXML
    private Label seatE12;

    @FXML
    private Label seatE11;

    @FXML
    private Label seatE10;

    @FXML
    private Label seatE9;

    @FXML
    private Label seatE8;

    @FXML
    private Label seatE7;

    @FXML
    private Label seatE6;

    @FXML
    private Label seatE5;

    @FXML
    private Label seatE4;

    @FXML
    private Label seatE3;

    @FXML
    private Label seatE2;

    @FXML
    private Label seatE1;

    @FXML
    private Label seatF12;

    @FXML
    private Label seatF11;

    @FXML
    private Label seatF10;

    @FXML
    private Label seatF9;

    @FXML
    private Label seatF8;

    @FXML
    private Label seatF7;

    @FXML
    private Label seatF6;

    @FXML
    private Label seatF5;

    @FXML
    private Label seatF4;

    @FXML
    private Label seatF3;

    @FXML
    private Label seatF2;

    @FXML
    private Label seatF1;

    @FXML
    private Label seatG4;

    @FXML
    private Label seatG3;

    @FXML
    private Label seatH2;

    @FXML
    private Label seatH1;

    @FXML
    private Label seatG12;

    @FXML
    private Label seatG11;

    @FXML
    private Label seatG10;

    @FXML
    private Label seatG9;

    @FXML
    private Label seatG8;

    @FXML
    private Label seatG7;

    @FXML
    private Label seatG6;

    @FXML
    private Label seatG5;

    @FXML
    private Label seatH8;

    @FXML
    private Label seatH7;

    @FXML
    private Label seatH6;

    @FXML
    private Label seatH5;

    @FXML
    private Label seatH4;

    @FXML
    private Label seatH3;

    @FXML
    private Label seatH12;

    @FXML
    private Label seatH11;

    @FXML
    private Label seatH10;

    @FXML
    private Label seatH9;

    @FXML
    private Label seatI12;

    @FXML
    private Label seatI11;

    @FXML
    private Label seatI10;

    @FXML
    private Label seatI9;

    @FXML
    private Label seatI8;

    @FXML
    private Label seatI7;

    @FXML
    private Label seatI6;

    @FXML
    private Label seatI5;

    @FXML
    private Label seatI4;

    @FXML
    private Label seatI3;

    @FXML
    private Label seatI2;

    @FXML
    private Label seatI1;

    @FXML
    private Label movieTitle;

    @FXML
    private Button btnPurchaseSeats;

    @FXML
    private ComboBox<?> comboBoxSelectTime;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        seatList.add(seatA1); seatList.add(seatA2); seatList.add(seatA3);
        seatList.add(seatA4); seatList.add(seatA5); seatList.add(seatA6);
        seatList.add(seatA7); seatList.add(seatA8); seatList.add(seatA9);
        seatList.add(seatA10); seatList.add(seatA11); seatList.add(seatA12);

        seatList.add(seatB1); seatList.add(seatB2); seatList.add(seatB3);
        seatList.add(seatB4); seatList.add(seatB5); seatList.add(seatB6);
        seatList.add(seatB7); seatList.add(seatB8); seatList.add(seatB9);
        seatList.add(seatB10); seatList.add(seatB11); seatList.add(seatB12);

        seatList.add(seatC1); seatList.add(seatC2); seatList.add(seatC3);
        seatList.add(seatC4); seatList.add(seatC5); seatList.add(seatC6);
        seatList.add(seatC7); seatList.add(seatC8); seatList.add(seatC9);
        seatList.add(seatC10); seatList.add(seatC11); seatList.add(seatC12);

        seatList.add(seatD1); seatList.add(seatD2); seatList.add(seatD3);
        seatList.add(seatD4); seatList.add(seatD5); seatList.add(seatD6);
        seatList.add(seatD7); seatList.add(seatD8); seatList.add(seatD9);
        seatList.add(seatD10); seatList.add(seatD11); seatList.add(seatD12);

        seatList.add(seatE1); seatList.add(seatE2); seatList.add(seatE3);
        seatList.add(seatE4); seatList.add(seatE5); seatList.add(seatE6);
        seatList.add(seatE7); seatList.add(seatE8); seatList.add(seatE9);
        seatList.add(seatE10); seatList.add(seatE11); seatList.add(seatE12);

        seatList.add(seatF1); seatList.add(seatF2); seatList.add(seatF3);
        seatList.add(seatF4); seatList.add(seatF5); seatList.add(seatF6);
        seatList.add(seatF7); seatList.add(seatF8); seatList.add(seatF9);
        seatList.add(seatF10); seatList.add(seatF11); seatList.add(seatF12);

        seatList.add(seatG1); seatList.add(seatG2); seatList.add(seatG3);
        seatList.add(seatG4); seatList.add(seatG5); seatList.add(seatG6);
        seatList.add(seatG7); seatList.add(seatG8); seatList.add(seatG9);
        seatList.add(seatG10); seatList.add(seatG11); seatList.add(seatG12);

        seatList.add(seatH1); seatList.add(seatH2); seatList.add(seatH3);
        seatList.add(seatH4); seatList.add(seatH5); seatList.add(seatH6);
        seatList.add(seatH7); seatList.add(seatH8); seatList.add(seatH9);
        seatList.add(seatH10); seatList.add(seatH11); seatList.add(seatH12);

        seatList.add(seatI1); seatList.add(seatI2); seatList.add(seatI3);
        seatList.add(seatI4); seatList.add(seatI5); seatList.add(seatI6);
        seatList.add(seatI7); seatList.add(seatI8); seatList.add(seatI9);
        seatList.add(seatI10); seatList.add(seatI11); seatList.add(seatI12);


        Label seatReference;
    }

    @FXML
    void clickGoBackBtn(ActionEvent event) {

    }

    @FXML
    void clickOpenSeat(MouseEvent event) {

    }

    @FXML
    void clickPurchaseSeatsBtn(ActionEvent event) {

    }

    @FXML
    void comboBoxSelectionChanged(ActionEvent event) {

    }

    @FXML
    void mouseEnterOpenSeat(MouseEvent event) {

    }

    @FXML
    void mouseExitOpenSeat(MouseEvent event) {

    }

}
