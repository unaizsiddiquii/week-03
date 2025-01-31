// Class with name SocialMediaLinkedList for the purpose of performing operations like
// Add a friend connection between two users.
// Remove a friend connection.
// Find mutual friends between two users.
// Display all friends of a specific user.
// Search for a user by Name or User ID.
// Count the number of friends for each user.
public class SocialMediaLinkedList {
    // Head and tail of the list
    private User head;
    private User tail;

    // Constructor
    public SocialMediaLinkedList(){
       head = null;
    }

    // Add user to the list
    public void addUser(int userId, String name, int age){
        // Creating a new node for new User
        User newUser = new User(userId, name,age);
        // if no one node is present
        if(head == null){
            head = newUser;
        }
        // if node is present
        else {
            User temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    // search for user by userId or name
    public User searchUser(String search){
        User temp = head;
        while(temp != null){
            // name or id is found
            if(String.valueOf(temp.userId).equals(search) || temp.name.equalsIgnoreCase(search)){
                return temp;
            }
            temp = temp.next;
        }
           // name or id is not found
           return null;
    }

    // Method to find user by Id
    private User findUserById(int userId) {
        User temp = head;
        while (temp != null) {
            // if id is found
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        // if id is not found
        return null;
    }

    // Add a friend connection between two users
    public void addFriendConnection(int userId1, int userId2){
        // Find user1 and user2 by findUserById helper method
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        // If both user1 or user2 are not found
        if(user1 != null || user2 != null){
            user1.addFriend(userId2);
            user2.addFriend(userId1);
        }
    }

    // Remove a friend connection
    public void removeFriendConnection(int userId1, int userId2){
        // Find user1 and user2 by findUserById helper method
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if(user1 != null || user2 != null){
            user1.removeFriend(userId2);
            user2.removeFriend(userId1);
        }
    }

    // Find mutual friend between two user
    public void findMutualFriends(int userId1, int userId2){
        // Find user1 and user2 by findUserById helper method
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if(user1 == null || user2 == null){
            System.out.println("One or both users not found ");
            return;
        }

        System.out.print("Mutual friends between "+ user1.name+" and "+ user2.name);
        boolean findMutual = false;
        // Check user1 and user2 is find into the array of friend or not
        for (int i = 0; i < user1.friendCount; i++) {
            for (int j = 0; j < user2.friendCount; j++) {
                if (user1.friends[i] == user2.friends[j]) {
                    System.out.print(user1.friends[i] + " ");
                    findMutual = true;
                    break;
                }
            }
        }
        // If mutual not found
        if (!findMutual) {
            System.out.print("None");
        }
        System.out.println();
    }

    // Display all friends of a specific user
    public void displayAllFriends(int userId) {
        User user = findUserById(userId);
        if (user != null) {
            user.displayFriends();
        }
    }

    // Count the number of friends for each user
    public void countFriends(){
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friendCount + " friends ");
            temp = temp.next;
        }
    }
}


