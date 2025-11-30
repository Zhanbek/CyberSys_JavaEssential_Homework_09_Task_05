import model.IProducer;

public class MyClass {
    public static <T> T factoryMethod(IProducer<T> creator) {
        return creator.produce();
    }

}
