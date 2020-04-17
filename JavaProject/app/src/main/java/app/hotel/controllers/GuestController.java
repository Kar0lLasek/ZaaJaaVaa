package app.hotel.controllers;

import app.hotel.Main;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;

public class GuestController {

    @FXML
    private TextField clientName;
    @FXML
    private TextField clientSurname;
    @FXML
    private TextField clientPhonenumber;


    public void addClient() {
        System.out.println("add guest");
        System.out.println(clientName.getText());
        System.out.println(clientSurname.getText());
        System.out.println(clientPhonenumber.getText());
        switchMainWindow();
    }

    public void modifyGuest() {
        System.out.println("modify guest");
        System.out.println(clientName.getText());
        System.out.println(clientSurname.getText());
        System.out.println(clientPhonenumber.getText());
        switchMainWindow();
    }

    public void switchMainWindow() {
        System.out.println("Powrót do main z GuestController");
        URL mainWindowLocation = Main.class.getResource("/" + "basic.fxml");
        try {
            Main.setScene(mainWindowLocation, 0, 0);
        } catch (IOException e) {
            System.err.println(mainWindowLocation);
            e.printStackTrace();
        }
    }
}
