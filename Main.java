package MUD;

public class Main {
    public static void main(String[] args){
        Room room = new Room("Dungeon", "A dark and scary place");
        Monster monster = new Monster("Orc", "A fearsome green creature", 100, 15);
        Merchant merchant = new Merchant("Trader Joe", "A friendly merchant", 50, new String[]{"Potion", "Sword"});
        Item item = new Item("Magic Sword", "A legendary blade with magical powers");
        Door door = new Door(true, "Next Level", "A heavy iron door");

        room.describe();
        monster.describe();
        monster.attack();
        merchant.describe();
        merchant.trade();
        item.describe();
        door.describe();
        door.unlock();
        door.describe();
    }
}
