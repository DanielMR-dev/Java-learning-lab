package week04oop.examples;

public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        setName(name);
        setPrice(price);
        setStock(stock);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("El nombre del producto no puede estar vacío");
            return;
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("El valor del producto no puede ser negativo");
            return;
        }
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            System.out.println("El stock no puede ser negativo");
            return;
        }
        this.stock = stock;
    }

    public double calculateTotalValue() {
        return price * stock;
    }

    public void increaseStock(int quantity) {
        if (quantity <= 0) {
            System.out.println("La cantidad a agregar debe ser mayor a cero");
            return;
        }
        this.stock += quantity;
    }

    public void decreaseStock(int quantity) {
        if (quantity <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor a cero");
            return;
        }
        if (quantity > stock) {
            System.out.println("No hay suficiente stock disponible");
            return;
        }
        this.stock -= quantity;
    }

    public void showProductInfo() {
        System.out.println("Producto: " + getName());
        System.out.println("Precio: $" + getPrice());
        System.out.println("Stock: " + getStock());
        System.out.println("Valor total en inventario: $" + calculateTotalValue());
    }

    public static void main(String[] args) {
        Product product = new Product("Laptop", 3500.00, 5);

        product.showProductInfo();

        System.out.println();

        product.increaseStock(3);
        product.decreaseStock(2);

        product.showProductInfo();
    }
}
