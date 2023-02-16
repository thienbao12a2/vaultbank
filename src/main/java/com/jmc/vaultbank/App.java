package com.jmc.vaultbank;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        Scene scence = new Scene(fxmlLoader.load());
        stage.setTitle("Vault Bank");
        stage.getIcons().add(new Image("file:anonymous-logo.png"));
        stage.setScene(scence);
        stage.show();
    }
}
