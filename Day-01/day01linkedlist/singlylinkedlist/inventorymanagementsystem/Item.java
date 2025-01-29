package day01linkedlist.singlylinkedlist.inventorymanagementsystem;
// Item class which is used to store information about an item
// such as Item Name, Item ID, Quantity, and Price
public class Item {
    // Attribute
    String itemName;
    int itemId;
    int quantity;
    double price;
    // Here next will be used to point the object or
    // node of next Item
    Item next;

    // Constructor to initialize item properties
    public Item(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
