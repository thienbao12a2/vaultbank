package com.jmc.vaultbank.Controllers.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateClientController implements Initializable {
    public TextField fname_field;
    public TextField lname_field;
    public TextField password_field;
    public CheckBox address_box;
    public Label address_label;
    public CheckBox add_checking_acc_box;
    public TextField checking_balance_field;
    public CheckBox add_saving_acc_box;
    public TextField saving_balance_field;
    public Button create_client_btn;
    public Label error_label;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
