package game.inventory;

public class Item {
    private String name;
    private String genre;
    private int stockCount;
    private String serialCode;

    public Item(String name, String genre, int stockCount, String serialCode) {
        this.name = name;
        this.genre = genre;
        this.stockCount = stockCount;
        this.serialCode = serialCode;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getStockCount() {
        return stockCount;
    }

    String getSerialCode() {
        return serialCode;
    }

    private boolean isAvailable(int quantity) {
        return stockCount >= quantity;
    }

    public void sell(int quantity) {
        if (isAvailable(quantity)) {
            stockCount = stockCount - quantity;
            System.out.println(quantity + " copy of " + name + " sold.");
        } else {
            System.out.println("Not enough stock for " + name + ".");
        }
    }
}

