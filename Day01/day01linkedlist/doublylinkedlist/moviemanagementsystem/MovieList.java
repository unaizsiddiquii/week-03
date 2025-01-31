// Class with name MovieList  for the purpose of performing the operations like
// Add a movie record at the beginning, end, or at a specific position.
// Remove a movie record by Movie Title.
// Search for a movie record by Director or Rating.
// Display all movie records in both forward and reverse order.
// Update a movie's Rating based on the Movie Title.
public class MovieList {
    // Head and tail of the list
    private Node head;
    private Node tail;

    // Constructor
    public MovieList(){
        this.head = null;
        this.tail = null;
    }

    // Adding movie at the beginning
    public  void addFirst(Movie movie){
        // creating a  new node for adding movie
        Node newNode = new Node(movie);
        // if  no node present in the list then head
        // and tail points to the new node
        if(head==null){
            head=tail=newNode;
            return;
        }
        // new node's next will points to the head
        newNode.next=head;
        // head's prev will point to the newNode
        head.prev=newNode;
        // head point to the new node
        head=newNode;
    }

    // Add movie at the end
    public void addLast(Movie movie) {
        // creating a  new node for adding movie
        Node newNode = new Node(movie);
        // if  no node present in the list then head
        // and tail points to the new node
        if (tail == null) {
            head = tail = newNode;
        } else {
            // tail's next will points to the newNode
            tail.next = newNode;
            // newNode's previous point to the tail
            newNode.prev = tail;
            // tail points the newNode
            tail = newNode;
        }
    }

    // Add movie at a specific position
    public void addAtPosition(Movie movie, int position) {
        // creating a  new node for adding movie
        Node newNode = new Node(movie);
        if (position == 0) {
            addFirst(movie);
            return;
        }
        // creating temp of Node type which is point to head
        Node temp = head;
        int index = 0;
        // iterate the loop util the index will be position-1
        while (temp != null && index < position - 1) {
            temp = temp.next;
            index++;
        }

        if (temp == null) {
            addLast(movie);
        } else {
            newNode.next = temp.next;
            newNode.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newNode;
            }
            temp.next = newNode;
        }
    }

    // Remove a movie by title
    public void removeByTitle(String title) {
        // Current will be the temporary variable which is points to the head
        Node current = head;
        // Iterate a loop util current will not be equal to null
        while (current != null) {
            // If movie title will be equal to the title which is given by us then
            // check the previous will not be equal to null
            if (current.movie.title.equals(title)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                }
                // if the previous is null then head will point the current's next
                else {
                    head = current.next;
                }
                // if current's next will not equal to null
                // then current's next's previous will point the previous of current
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                // if current's next will  equal to null
                // then tail point to the current's previous
                else {
                    tail = current.prev;
                }
                return;
            }
            // update current
            current = current.next;
        }
        System.out.println("Movie not found");
    }

    // Search movies by director
    public void searchByDirector(String director) {
        // Current will be the temporary variable which is points to the head
        Node current = head;
        while (current != null) {
            if (current.movie.director.equalsIgnoreCase(director)) {
                System.out.println(current.movie.title + " (" + current.movie.yearOfRelease + ") - Rating: " + current.movie.rating);
            }
            current = current.next;
        }
    }

    // Search movies by rating
    public void searchByRating(double rating) {
        // Current will be the temporary variable which is points to the head
        Node current = head;
        while (current != null) {
            if (current.movie.rating == rating) {
                System.out.println(current.movie.title + " (" + current.movie.yearOfRelease + ") - Director: " + current.movie.director);
            }
            current = current.next;
        }
    }

    // Update movie rating by title
    public void updateRatingByTitle(String title, double newRating) {
        // Current will be the temporary variable which is points to the head
        Node current = head;
        // Iterate until the current not equal to null
        while (current != null) {
            //check current movie's title if equal to the title which is given by us
            // if true then update the rating
            if (current.movie.title.equals(title)) {
                //
                current.movie.rating = newRating;
                System.out.println("Updated rating for " + title + " to " + newRating);
                return;
            }
            // update current
            current = current.next;
        }
        System.out.println("Movie not found");
    }

    // Display all movies forward
    public void displayForward() {
        // Current will be the temporary variable which is points to the head
        Node current = head;
        // Iterate until the current not equal to null
        while (current != null) {
            System.out.println(current.movie.title + " (" + current.movie.yearOfRelease + ") - Director: " + current.movie.director + " - Rating: " + current.movie.rating);
            current = current.next;
        }
    }

    // Display all movies backward
    public void displayBackward() {
        // Current will be the temporary variable which is points to the tail
        Node current = tail;
        // Iterate until the current not equal to null
        while (current != null) {
            System.out.println(current.movie.title + " (" + current.movie.yearOfRelease + ") - Director: " + current.movie.director + " - Rating: " + current.movie.rating);
            current = current.prev;
        }
    }


}