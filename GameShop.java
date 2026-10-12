import game.inventory.Item;
import game.inventory.Inventory;

public class GameShop {
    public static void main(String[] args) {

        Inventory shop = new Inventory();

        Item game1 = new Item(
                "Galaxy Racer",
                "Racing",
                12,
                "GR-4421"
        );

        Item game2 = new Item(
                "Shadow Realm",
                "RPG",
                5,
                "SR-8873"
        );
        Item game3 = new Item(
                "Pixel Legends",
                "Strategy",
                3,
                "PL-0091"
        );

        shop.addItem(game1);
        shop.addItem(game2);
        shop.addItem(game3);

        shop.displayAll();

        System.out.println();

        game1.sell(4);
        game2.sell(6);

        System.out.println();

        shop.displayAll();

        System.out.println();

        shop.auditSerialCodes();

    }
}
