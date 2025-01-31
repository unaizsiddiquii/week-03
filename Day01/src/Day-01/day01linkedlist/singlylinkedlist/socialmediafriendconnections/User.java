// User class used to  represents a user with
// User ID, Name, Age, and List of Friend IDs
public class User {
    // Attribute
    int userId;
    String name;
    int age;
    // Array of type int with name friends
    // for the purpose of storing friends
    int[] friends;
    // variable friendCount used to count the number of friend
    int friendCount;
    // Here next will be used to point the object or
    // node of next friend
    User next;

    // Constructor for initializing the attribute
    User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        // Initializing the size of the friends array
        this.friends = new int[10];
        this.friendCount = 0;
        this.next = null;

    }

    // Add a friend into the list
    public void addFriend(int friendId){
        if(friendCount >= friends.length){
            // increasing the length of the array if it is full
            int newFriends[] = new int [friends.length * 2];
            System.arraycopy(friends,0,newFriends,0,friends.length);
            friends = newFriends;
        }
        // increasing the friendCount
        friends[friendCount++]=friendId;
    }

    // remove a friend from the list
    public void removeFriend(int friendId){
        for(int i = 0; i < friendCount; i++){
            if(friends[i] == friendId){
                // after removing the friend shift the elements
                for(int j = i; j < friendCount - 1; j++){
                    friends[j] = friends[j+1];
                }
                // decrease the friendCount
                friendCount--;
                return;
            }
        }
    }

    // Display user's friend
    public void displayFriends(){
        System.out.print(name + " (" + userId + ")'s friend : ");
        for(int i = 0; i < friendCount; i++){
            System.out.print(friends[i]+ " ");
        }
        System.out.println();
    }
}
