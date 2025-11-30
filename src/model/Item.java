package model;

public class Item {
    String title;

    public Item (String title) {
        this.title = title;
        System.out.println("Товар '" + this.title + "' зроблений і готовий до відправки на продаж!");
    }

    @Override
    public String toString() {
        return "Item {" +
                "title='" + title + '\'' +
                '}';
    }
}
