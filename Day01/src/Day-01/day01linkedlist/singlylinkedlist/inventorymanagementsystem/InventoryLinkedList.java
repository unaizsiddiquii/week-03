// Class with name InventoryLinkedList for the purpose of performing the operations like
// Add an item at the beginning, end, or at a specific position.
// Remove an item based on Item ID.
// Update the quantity of an item by Item ID.
// Search for an item based on Item ID or Item Name.
// Calculate and display the total value of inventory (Sum of Price * Quantity for each item).
// Sort the inventory based on Item Name or Price in ascending or descending order.

import Student;

public class InventoryLinkedList {
    // Head and tail of the list
    private Item head;
    private Item tail;

    // Constructor
    public InventoryLinkedList() {
        head = null;
    }

    //Adding an item at the beginning
    public void addAtBeginning(String itemName, int itemId, int quantity, double price) {

        // creating a node for Item
        Item newItem = new Item(itemName, itemId, quantity, price);
        // if  no node present in the list then head
        // and tail points to the new node i.e newItem
        if(head==null){
            head=tail=newItem;
            return;
        }
        // new node's next will points to the head
        newItem.next = head;
        // head point to the new node
        head = newItem;
    }

    // Add an item at the end
    public void addAtEnd(String itemName, int itemId, int quantity, double price) {
        // creating a node for Item
        Item newItem = new Item(itemName, itemId, quantity, price);
        // if  no node present in the list then head
        // and tail points to the new node i.e newItem
        if(head==null){
            head=tail=newItem;
            return;
        }
        // tail's next will points the new node
        tail.next = newItem;
        // tail point to the new node
        tail = newItem;
    }

    // Adding an item at a specific position
    public void addAtPosition(String itemName, int itemId, int quantity, double price, int position) {
        if(position < 1){
            System.out.println("Invalid position");
        }
        // creating a node for new student
        Item newItem = new Item(itemName, itemId, quantity, price);
        if(position == 1){
           addAtBeginning(itemName,itemId,quantity,price);
            return;
        }
        // creating temp of Item type which is point to head
        Item temp = head;
        int i = 1;
        // iterate the loop util the i will be position-1
        while(temp != null && i < position-1){
            temp = temp.next;
            i++;
        }
        // Check temp is null or not if yes then print index out of bound
        // else new node's next points the next of temp and temp's next
        // point the new node i.e newItem

        if(temp == null){
            System.out.println("Index of position out of bound");
        }
        else {
            newItem.next = temp.next;
            temp.next = newItem;
        }
    }

    // Remove an item based on Item ID
    public void removeByItemId(int itemId) {
        // Check if the head is null or not
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        // Check itemId is match with the head's itemId or not
        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        Item current = head;
        while (current.next != null && current.next.itemId != itemId) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Item with ID " + itemId + " not found.");
        } else {
            current.next = current.next.next;
        }
    }

    // Search for an item by Item ID
    public Item searchByItemId(int itemId) {
        Item current = head;
        while (current != null) {
            // if itemId found
            if (current.itemId == itemId) {
                return current;
            }
            current = current.next;
        }
        // itemId not found
        return null;
    }

    // Search for an item by Item Name
    public Item searchByItemName(String itemName) {
        Item current = head;
        while (current != null) {
            // if itemName found
            if (current.itemName.equals(itemName)) {
                return current;
            }
            current = current.next;
        }
        // itemName not found
        return null;
    }


    // Update the quantity of an item by Item ID
    public void updateQuantity(int itemId, int newQuantity) {
        Item item = searchByItemId(itemId);
        if (item != null) {
            item.quantity = newQuantity;
            System.out.println("Quantity updated for item ID " + itemId);
        } else {
            System.out.println("Item with ID " + itemId + " not found.");
        }
    }

    // Calculate the total value of the inventory
    public double calculateTotalValue() {
        double totalValue = 0;
        Item current = head;
        while (current != null) {
            totalValue += current.price * current.quantity;
            current = current.next;
        }
        return totalValue;
    }

    // Merge sort the list based on Item Name or Price
    public void sort(String criteria, boolean ascending) {
        head = mergeSort(head, criteria, ascending);
    }

    // Merge Sort Helper Method
    private Item mergeSort(Item head, String criteria, boolean ascending) {
        if (head == null || head.next == null) {
            return head;
        }
        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;

        middle.next = null;

        Item left = mergeSort(head, criteria, ascending);
        Item right = mergeSort(nextOfMiddle, criteria, ascending);

        return merge(left, right, criteria, ascending);
    }

    // Get middle element of the linked list
    private Item getMiddle(Item head) {
        if (head == null) {
            return null;
        }
        Item slow = head;
        Item fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted linked lists based on Item Name or Price
    private Item merge(Item left, Item right, String criteria, boolean ascending) {
        Item result = null;
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        if (criteria.equals("name")) {
            if ((ascending && left.itemName.compareTo(right.itemName) <= 0) ||
                    (!ascending && left.itemName.compareTo(right.itemName) > 0)) {
                result = left;
                result.next = merge(left.next, right, criteria, ascending);
            } else {
                result = right;
                result.next = merge(left, right.next, criteria, ascending);
            }
        } else if (criteria.equals("price")) {
            if ((ascending && left.price <= right.price) ||
                    (!ascending && left.price > right.price)) {
                result = left;
                result.next = merge(left.next, right, criteria, ascending);
            } else {
                result = right;
                result.next = merge(left, right.next, criteria, ascending);
            }
        }
        return result;
    }

    // Display all items in the inventory
    public void displayAll() {
        if (head == null) {
            System.out.println("No inventory items available");
            return;
        }
        Item current = head;
        while (current != null) {
            System.out.println("Item ID: " + current.itemId + ", Name: " + current.itemName +
                    ", Quantity: " + current.quantity + ", Price: " + current.price);
            current = current.next;
        }
    }
}
