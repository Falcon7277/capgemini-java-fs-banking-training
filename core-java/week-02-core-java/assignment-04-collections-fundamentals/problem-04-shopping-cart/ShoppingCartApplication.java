import java.util.ArrayList;
import java.util.List;

public class ShoppingCartApplication {
    public static void main(String[] args) {
        List<Item> cart = new ArrayList<>();

        cart.add(new Item("Laptop", 1));
        cart.add(new Item("Headphones", 2));
        cart.add(new Item("Mouse", 1));

        cart.remove(1); //removes headphones

        cart.get(1).quantity--; // update headphones quantity
        System.out.println("Final Shopping Cart:");
        for (Item p : cart) {
            System.out.println(p.name + " - Quantity: " + p.quantity);
        }
    }
}

class Item {
    String name;
    int quantity;

    Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}
