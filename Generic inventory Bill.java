import java.util.*;
// Generic Product class - demonstrates Generics + Encapsulation
class Product<T> {
 private T id;
 private String name;
 private int quantity;
 private double price;
 public Product(T id, String name, int quantity, double price) {
 this.id = id;
 this.name = name;
 this.quantity = quantity;
 this.price = price;
 }
 // Encapsulation: controlled access via getters/setters
 public T getId() { return id; }
 public String getName() { return name; }
 public int getQuantity() { return quantity; }
 public double getPrice() { return price; }
 public void setQuantity(int quantity) { this.quantity = quantity; }
 public void setPrice(double price) { this.price = price; }
 public double getTotal() {
 return quantity * price;
 }
 public void display() {
 System.out.printf("%-8s %-15s %-8d %-10.2f %-10.2f%n",
 id, name, quantity, price, getTotal());
 }
}
// Generic Inventory class - demonstrates Collections
class Inventory<T> {
 private List<Product<T>> products = new ArrayList<>();
 public void addProduct(Product<T> product) {
 products.add(product);
 }
 public void displayInventory() {
 System.out.printf("%-8s %-15s %-8s %-10s %-10s%n",
 "ID", "Name", "Qty", "Price", "Total");
 System.out.println("---------------------------------------------------");
 for (Product<T> p : products) {
 p.display();
 }
 }
 public double generateBill() {
 double grandTotal = 0;
 for (Product<T> p : products) {
 grandTotal += p.getTotal();
 }
 return grandTotal;
 }
}
// Main class - Object creation & program entry point
public class InventoryBillingSystem {
 public static void main(String[] args) {
 Inventory<Integer> inventory = new Inventory<>();
 inventory.addProduct(new Product<>(101, "Notebook", 5, 40.0));
 inventory.addProduct(new Product<>(102, "Pen", 10, 10.0));
 inventory.addProduct(new Product<>(103, "Bag", 2, 500.0));
 System.out.println("---- Inventory Details ----");
 inventory.displayInventory();
 double total = inventory.generateBill();
 System.out.println("---------------------------------------------------");
 System.out.printf("Grand Total: Rs. %.2f%n", total);
 }
}