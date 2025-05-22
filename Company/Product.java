package Company;

public class Product {
    private static int idCounter = 1;
    private int id;
    private String name;
    private int quantity;
    private int minStock;

    public Product(String name, int quantity, int minStock) {
        this.id = idCounter++;
        this.name = name;
        this.quantity = quantity;
        this.minStock = minStock;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getMinStock() {
        return minStock;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setMinStock(int minStock) {
        this.minStock = minStock;
    }

    public void addStock(int amount) {
        this.quantity += amount;
    }

    public boolean isLowStock() {
        return quantity <= minStock;
    }

    public static void setIdCounter(int nextId) {
        idCounter = nextId;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    @Override
    public String toString() {
        String text = "ID" + id + "\n" +
                "Product: " + name + "\n" +
                "Quantity: " + quantity + "\n" +
                "Min Strock: " + minStock;
        return text;
    }

}
