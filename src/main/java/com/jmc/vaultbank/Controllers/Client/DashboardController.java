package com.jmc.vaultbank.Controllers.Client;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    public Text user_name;
    public Label login_date;
    public Label checking_balance;
    public Label checking_number;
    public Label saving_balance;
    public Label saving_number;
    public Label deposit_amount;
    public Label expense_amount;
    public ListView transaction_listview;
    public TextField payee_field;
    public TextField amount_field;
    public TextArea message_field;
    public Button transfer_money_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
