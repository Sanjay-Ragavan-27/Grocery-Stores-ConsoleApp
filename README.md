# Grocery Stores Console Application

This is a simple Java console application for managing a grocery store's inventory and placing orders. The application allows users to:
- View a list of available groceries with their prices.
- Place orders by selecting items and specifying quantities.
- Calculate and display the total amount of the order.

## Features

- **Display Groceries**: Shows the list of groceries available for purchase, including their ID, name, and price.
- **Place Orders**: Allows users to select items by ID and specify the quantity for each item.
- **Calculate Total**: Computes the total cost of the selected groceries based on the quantities chosen by the user.

## Methods

### 1. `displayGrocery(Map<Integer, Grocery> grocery)`
This method displays the available groceries with their respective IDs, names, and prices.

### 2. `placeOrder(Map<Integer, Grocery> grocery)`
This method allows the user to place an order by specifying the grocery ID and quantity. It updates the total price for each item selected and asks whether the user wants to add more items.

### 3. `displayTotal(Map<Integer, Grocery> grocery)`
This method displays the total amount of the order after the user has finished selecting items.

## Class Structure

### `Grocery` Class
The `Grocery` class represents an individual grocery item. It contains:
- `name`: The name of the grocery item (e.g., Biscuit, Rice, etc.).
- `price`: The price of the grocery item.
- `total`: A static variable that tracks the total cost of all selected groceries.
- `itemCount`: A static variable that tracks the number of groceries in the inventory.

### `Main` Class
The `Main` class contains the main logic for displaying groceries, placing orders, and calculating the total. It uses a `Map` to store the grocery items, where the key is an integer (representing the grocery ID), and the value is a `Grocery` object.

## Example Usage

```java
public class Main {
    public static void main(String[] args) {
        Map<Integer, Grocery> grocery = new HashMap<>();
        grocery.put(1, new Grocery("Biscuit", 30));
        grocery.put(3, new Grocery("Rice", 50));
        grocery.put(4, new Grocery("Sugar", 40));
        grocery.get(0).itemCount += 4; // Set total grocery items

        displayGrocery(grocery);  // Display grocery list and start ordering
    }
}
