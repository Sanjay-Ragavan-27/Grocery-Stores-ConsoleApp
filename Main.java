import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Grocery{
    String name;
    int price;
    static int total=0;
    static int itemCount=0;
    Grocery(String name, int price){
        this.name = name;
        this.price = price;
    }
}

public class Main {
    static Scanner sc = new Scanner(System.in);

    static void displayGrocery(Map<Integer, Grocery> grocery){
        int n= grocery.get(0).itemCount;
        for(int i=1;i<n;i++){
            System.out.println("ID:"+i +" "+grocery.get(i).name +" Rs." +grocery.get(i).price);
        }
        placeOrder(grocery);
    }

    static void placeOrder(Map<Integer, Grocery> grocery){
        char ch;
        do{
            System.out.println("Enter the id of the grocery");
            int id = sc.nextInt();
            System.out.println("Enter the quantity of the grocery");
            int quantity = sc.nextInt();
            grocery.get(id).total += grocery.get(id).price * quantity;
            System.out.println("Add another grocery(Y/N)");
            ch = sc.next().charAt(0);
        }while(ch == 'y'|| ch=='Y');
        displayTotal(grocery);
    }
    static void displayTotal(Map<Integer, Grocery> grocery){
        System.out.println("Total amount: Rs. "+grocery.get(0).total);
    }

    public static void main(String[] args) {
        Map<Integer, Grocery> grocery= new HashMap<>();
        grocery.put(1, new Grocery("Biscuit", 30));
        grocery.put(3, new Grocery("Rice",50));
        grocery.put(4, new Grocery("Sugar",40));
        grocery.get(0).itemCount+=4;

        displayGrocery(grocery);
    }
}