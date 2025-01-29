package day01linkedlist.circularlinkedlist.onlineticketreservationsystem;
import java.time.LocalDateTime;
// Main class of Online Ticket Reservation System
public class OnlineTicketReservationSystem {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        // Add some tickets
        system.addTicket(new Ticket(1, "Pragya", "Avengers", "A1", LocalDateTime.now()));
        system.addTicket(new Ticket(2, "Harsh", "Spider-Man", "B3", LocalDateTime.now()));
        system.addTicket(new Ticket(3, "Riya", "Avatar", "C5", LocalDateTime.now()));

        // Display all tickets
        System.out.println("All Booked Tickets:");
        system.displayTickets();

        // Search for a ticket by Customer Name
        System.out.println("Searching for tickets by Customer Name 'John Doe':");
        system.searchTicket("John Doe");

        // Search for a ticket by Movie Name
        System.out.println("Searching for tickets by Movie Name 'Avatar':");
        system.searchTicket("Avatar");

        // Remove a ticket by Ticket ID
        system.removeTicket(2);

        // Display tickets after removal
        System.out.println("Tickets after removal:");
        system.displayTickets();

        // Calculate the total number of booked tickets
        system.totalBookedTickets();
    }
}
