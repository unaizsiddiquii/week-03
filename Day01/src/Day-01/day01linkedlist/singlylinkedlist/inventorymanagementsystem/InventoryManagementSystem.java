// Main class of Inventory Management System
public class InventoryManagementSystem {
    public static void main (String args[]){
    InventoryLinkedList inventory = new InventoryLinkedList();

    // Add items to inventory
        inventory.addAtBeginning("Laptop", 101, 50, 800.0);
        inventory.addAtEnd("Smartphone", 102, 200, 300.0);
        inventory.addAtEnd("Headphones", 103, 150, 50.0);
        inventory.addAtEnd("Keyboard", 104, 120, 30.0);

    // Display all items
        System.out.println("Inventory List:");
        inventory.displayAll();

    // Update item quantity
        inventory.updateQuantity(102, 250);

    // Remove item by ID
        inventory.removeByItemId(103);

    // Search for item by ID
    Item item = inventory.searchByItemId(101);
        if (item != null) {
        System.out.println("Found Item: " + item.itemName);
    }

    // Search for item by name
    item = inventory.searchByItemName("Laptop");
        if (item != null) {
        System.out.println("Found Item: " + item.itemName);
    }

    // Calculate and display total value of inventory
    double totalValue = inventory.calculateTotalValue();
        System.out.println("Total Inventory Value: " + totalValue);

    // Sort inventory by price in ascending order and display
        inventory.sort("price", true);
        System.out.println("Inventory sorted by Price :");
        inventory.displayAll();

    // Sort inventory by name in descending order and display
        inventory.sort("name", false);
        System.out.println("Inventory sorted by Name :");
        inventory.displayAll();
}
}
