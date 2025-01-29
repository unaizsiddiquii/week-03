package day01linkedlist.singlylinkedlist.socialmediafriendconnections;
// Main class for Social Media Friend Connections app
public class SocialMediaFriendConnections {
    public static void main(String[] args) {
        SocialMediaLinkedList socialMedia = new SocialMediaLinkedList();

        // Add users
        socialMedia.addUser(1, "Pragya", 21);
        socialMedia.addUser(2, "Harsh", 22);
        socialMedia.addUser(3, "Riya", 23);
        socialMedia.addUser(4, "Shubhi", 24);

        // Add friends
        socialMedia.addFriendConnection(1, 2);
        socialMedia.addFriendConnection(1, 3);
        socialMedia.addFriendConnection(2, 4);
        socialMedia.addFriendConnection(3, 4);

        // Display all friends of a user
        // Pragya's friends
        socialMedia.displayAllFriends(1);
        // Harsh's friends
        socialMedia.displayAllFriends(2);

        // Find mutual friends between two users
        // Pragya and Shubhi
        socialMedia.findMutualFriends(1, 4);

        // Count friends for each user
        socialMedia.countFriends();

        // Remove a friend connection
        socialMedia.removeFriendConnection(1, 2);
        // Pragya's friends after removing Harsh
        socialMedia.displayAllFriends(1);
    }
}
