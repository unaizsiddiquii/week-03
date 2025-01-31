public class TicketReservationSystem {
    Node head;
    Node tail;
    int size;

    // Constructor
    public TicketReservationSystem() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Add a new ticket reservation at the end of the list
    public void addTicket(Ticket ticket) {
        Node newNode = new Node(ticket);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;  // Circular link
        } else {
            tail.next = newNode;
            newNode.next = head;  // Circular link
            tail = newNode;
        }
        size++;
        System.out.println("Ticket booked successfully: " + ticket.ticketId);
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }
        Node currentNode = head;
        Node prevNode = null;
        do {
            if (currentNode.ticket.ticketId == ticketId) {
                if (prevNode == null) {
                    head = head.next;
                    tail.next = head;  // Update the tail's next pointer
                } else {
                    prevNode.next = currentNode.next;
                    if (currentNode == tail) {
                        tail = prevNode;  // Update tail if needed
                    }
                }
                size--;
                System.out.println("Ticket with ID " + ticketId + " has been removed.");
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        } while (currentNode != head);

        System.out.println("Ticket with ID " + ticketId + " not found.");
    }

    // Display all tickets in the list starting from the head node
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }
        Node currentNode = head;
        do {
            Ticket ticket = currentNode.ticket;
            System.out.println("Ticket ID: " + ticket.ticketId +
                    ", Customer Name: " + ticket.customerName +
                    ", Movie: " + ticket.movieName +
                    ", Seat: " + ticket.seatNumber +
                    ", Booking Time: " + ticket.bookingTime);
            currentNode = currentNode.next;
        } while (currentNode != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String searchValue) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }
        Node currentNode = head;
        boolean found = false;
        do {
            Ticket ticket = currentNode.ticket;
            if (ticket.customerName.equalsIgnoreCase(searchValue) || ticket.movieName.equalsIgnoreCase(searchValue)) {
                System.out.println("Ticket found: " +
                        "Ticket ID: " + ticket.ticketId +
                        ", Customer Name: " + ticket.customerName +
                        ", Movie: " + ticket.movieName +
                        ", Seat: " + ticket.seatNumber +
                        ", Booking Time: " + ticket.bookingTime);
                found = true;
            }
            currentNode = currentNode.next;
        } while (currentNode != head);

        if (!found) {
            System.out.println("No ticket found with the given name or movie.");
        }
    }

    // Calculate the total number of booked tickets
    public void totalBookedTickets() {
        System.out.println("Total tickets booked: " + size);
    }
}
