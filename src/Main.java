import model.Factory;
import model.Item;

public class Main {
    public static void main(String[] args) {
        Factory myFactory = new Factory();
        Item p = MyClass.factoryMethod(myFactory);

        System.out.println(p);
    }
}
