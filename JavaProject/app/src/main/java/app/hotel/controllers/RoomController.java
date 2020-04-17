package app.hotel.controllers;

import app.hotel.Main;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;

public class RoomController {
    @FXML
    private TextField roomNumber;
    @FXML
    private TextField roomCapacity;
    @FXML
    private TextField roomPrice;


    public void addRoom() {
        System.out.println("add room");
        System.out.println(roomNumber.getText());
        System.out.println(roomCapacity.getText());
        System.out.println(roomPrice.getText());
        switchMainWindow();
    }

    public void modifyRoom() {
        System.out.println("modify room");
        System.out.println(roomNumber.getText());
        System.out.println(roomCapacity.getText());
        System.out.println(roomPrice.getText());
        switchMainWindow();
    }

    public void switchMainWindow() {
        System.out.println("Powrót do main z RoomController");
        URL mainWindowLocation = Main.class.getResource("/" + "basic.fxml");
        try {
            Main.setScene(mainWindowLocation, 0, 0);
        } catch (IOException e) {
            System.err.println(mainWindowLocation);
            e.printStackTrace();
        }
    }
}
