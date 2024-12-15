# Grocery Management Application in Java

## Overview

This project implements a **Grocery Management Application** in Java. Users can view a list of available grocery items, place orders by selecting quantities, and calculate the total cost dynamically. The application is interactive and utilizes Java collections to manage items and their prices.

---

## Features

1. **Grocery Display**: Displays a list of available groceries with their IDs, names, and prices.  
2. **Order Placement**: Allows users to select grocery items and specify quantities for purchase.  
3. **Total Calculation**: Dynamically calculates the total cost based on the selected items and quantities.  
4. **Interactive Menu**: Provides an easy-to-use menu for navigating the application.  

---

## Code Structure

### **Classes**

| Class      | Description                                                                  |
|------------|------------------------------------------------------------------------------|
| `Grocery`  | Represents a grocery item with attributes like name, price, and total cost.  |
| `Main`     | Coordinates the application flow, manages grocery data, and handles user interaction. |

### **Main Class Methods**

| Method                  | Description                                                                  |
|-------------------------|------------------------------------------------------------------------------|
| `displayGrocery()`      | Displays the list of available groceries.                                    |
| `placeOrder()`          | Handles the process of selecting groceries and specifying quantities.        |
| `displayTotal()`        | Calculates and displays the total cost of the order.                        |

---

## How to Use

1. Clone this repository or copy the code.  
2. Compile and run the `Main` class.  
3. View the available grocery items and place your order.  

### Example Code

```java
public class Main {
    public static void main(String[] args) {
        Map<Integer, Grocery> grocery = new HashMap<>();
        grocery.put(1, new Grocery("Biscuit", 30));
        grocery.put(3, new Grocery("Rice", 50));
        grocery.put(4, new Grocery("Sugar", 40));
        grocery.get(0).itemCount += 4;

        displayGrocery(grocery);
    }
}
```

---

## Sample Output

```
ID:1 Biscuit Rs.30
ID:3 Rice Rs.50
ID:4 Sugar Rs.40
Enter the id of the grocery: 1
Enter the quantity of the grocery: 2
Add another grocery(Y/N): Y
Enter the id of the grocery: 3
Enter the quantity of the grocery: 1
Add another grocery(Y/N): N
Total amount: Rs. 110
```

---

## Customization

- Add more grocery items to the catalog.  
- Implement user authentication for personalized orders.  
- Save order history to a file for persistence.  
- Enhance the interface with categorized grocery lists (e.g., fruits, vegetables, grains).  

---
