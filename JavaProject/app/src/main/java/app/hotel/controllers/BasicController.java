package app.hotel.controllers;

import app.hotel.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import org.springframework.stereotype.Controller;

import java.net.URL;

import static app.hotel.controllers.AuxiliaryController.changeScene;

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
        changeScene(addRoomWindowLocation, 460, 360);
    }

    public void switchModifyRoomWindow() {
        URL modifyRoomWindowLocation = Main.class.getResource("/" + "modifyRoomWindow.fxml");
        changeScene(modifyRoomWindowLocation, 460, 360);
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
        changeScene(addGuestWindowLocation, 460, 360);
    }

    public void switchModifyGuestWindow() {
        URL modifyGuestWindowLocation = Main.class.getResource("/" + "modifyGuestWindow.fxml");
        changeScene(modifyGuestWindowLocation, 460, 360);
    }

    public void deleteGuest() {
        System.out.println("Usuniety chlop");
    }

    // ---- reservations ----
    public void switchAddReservationWindow() {
        URL addReservationWindowLocation = Main.class.getResource("/" + "addReservationWindow.fxml");
        changeScene(addReservationWindowLocation, 460, 360);
    }

    public void switchModifyReservationWindow() {
        URL modifyReservationWindowLocation = Main.class.getResource("/" + "modifyReservationWindow.fxml");
        changeScene(modifyReservationWindowLocation, 460, 360);
    }

    public void deleteReservation() {
        System.out.println("delete reservation");
    }

    public void generateReservationReport() {
        URL reservationReportWindowLocation = Main.class.getResource("/" + "reservationReportWindow.fxml");
        changeScene(reservationReportWindowLocation, 460, 360);
    }

    // ---- users ----
    public void switchAddUserWindow() {
        URL addUserWindowLocation = Main.class.getResource("/" + "addUserWindow.fxml");
        changeScene(addUserWindowLocation, 460, 360);
    }

    public void switchModifyUserWindow() {
        URL modifyUserWindowLocation = Main.class.getResource("/" + "modifyUserWindow.fxml");
        changeScene(modifyUserWindowLocation, 460, 360);
    }

    public void deleteUser() {
        System.out.println("Delete user");
    }

    // ---- other methods ----
    public void refreshAll() {
        System.out.println("Odśwież button");
    }


}
