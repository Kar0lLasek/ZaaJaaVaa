package app.hotel.controllers;

import app.hotel.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Tab;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;

@Controller
public class BasicController {

    @FXML
    private Tab rooms, guests, reservations, users;
    @FXML
    private URL location;
    /* jak bedzie polaczone z modelem
    @FXML
    private TableView<Room> roomsTable;

    @FXML
    private TableColumn<Room, String>
            roomId,
            roomNumber,
            roomCapacity,
            roomPurchasePrice,
            roomState;

    @FXML
    public Room getSelectedRoom() {
        return roomsTable.getSelectionModel().getSelectedItem();
    }

    @FXML
    private TableView<Guest> guestsTable;
    @FXML
    private TableColumn<Guest, String>
            guestId,
            guestName,
            guestSurname,
            guestPhonenumber,
            guestDiscount;

    @FXML
    public Guest getSelectedGuest() {
        return guestsTable.getSelectionModel().getSelectedItem();
    }

    @FXML
    private TableView<Reservation> reservationsTable;
    @FXML
    private TableColumn<Reservation, String>
            reservationId,
            guestID,
            roomID,
            startDate,
            endDate,
            totalPrice;

    @FXML
    public Reservation getSelectedReservation() {
        return reservationsTable.getSelectionModel().getSelectedItem();
    }


    @FXML
    private TableView<User> usersTable;
    @FXML
    private TableColumn<User, String>
            userId,
            userFirstName,
            userLastName,
            userType;

    @FXML
    public User getSelectedUser() {
        return usersTable.getSelectionModel().getSelectedItem();
    }


                                                                */


    // ---- methods ------------------------------------------------------------------------------------------------
    // ----rooms----
    public void switchAddRoomWindow() {
        URL addRoomWindowLocation = Main.class.getResource("/" + "addRoomWindow.fxml");
        try {
            Main.setScene(addRoomWindowLocation, 460, 360);
        } catch (IOException e) {
            System.err.println(addRoomWindowLocation);
            e.printStackTrace();
        }
    }

    public void switchModifyRoomWindow() {
        URL modifyRoomWindowLocation = Main.class.getResource("/" + "modifyRoomWindow.fxml");
        try {
            Main.setScene(modifyRoomWindowLocation, 460, 360);
        } catch (IOException e) {
            System.err.println(modifyRoomWindowLocation);
            e.printStackTrace();
        }

    }

    public void deleteRoom() {
        System.out.println("Usuniety pokoj");
    }

    public void generateRoomRaport() {
        System.out.println("raport pokoi");
    }

    // ----guests----
    public void switchAddGuestWindow() {
        URL addGuestWindowLocation = Main.class.getResource("/" + "addGuestWindow.fxml");
        try {
            Main.setScene(addGuestWindowLocation, 460, 360);
        } catch (IOException e) {
            System.err.println(addGuestWindowLocation);
            e.printStackTrace();
        }
    }

    public void switchModifyGuestWindow() {
        URL modifyGuestWindowLocation = Main.class.getResource("/" + "modifyGuestWindow.fxml");
        try {
            Main.setScene(modifyGuestWindowLocation, 460, 360);
        } catch (IOException e) {
            System.err.println(modifyGuestWindowLocation);
            e.printStackTrace();
        }
    }

    public void deleteGuest() {
        System.out.println("Usuniety chlop");
    }

    // ---- reservations ----
    public void switchAddReservationWindow() {

    }

    public void switchModifyReservationWindow() {

    }

    public void deleteReservation() {

    }

    public void generateReservationReport() {

    }

    // ---- users ----
    public void switchAddUserWindow() {

    }

    public void switchModifyUserWindow() {

    }

    public void deleteUser() {

    }

    // ---- other methods ----
    public void refreshAll() {
        System.out.println("Odśwież button");
    }


}
