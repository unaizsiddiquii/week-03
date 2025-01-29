package day01linkedlist.circularlinkedlist.onlineticketreservationsystem;
import java.time.LocalDateTime;
// Class with name Ticket used to store the following information:
// Ticket ID, Customer Name, Movie Name, Seat Number, and Booking Time
public class Ticket {
    // Attribute
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    LocalDateTime bookingTime;

    // Constructor
    Ticket(int ticketId, String customerName, String movieName, String seatNumber, LocalDateTime bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
    }
}
