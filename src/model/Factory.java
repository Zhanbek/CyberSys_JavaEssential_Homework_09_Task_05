package model;

public class Factory implements IProducer<Item> {
    @Override
    public Item produce() {
        Item item = new Item("Notebook");
        return item;
    }
}
