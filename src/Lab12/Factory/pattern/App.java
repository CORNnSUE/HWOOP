package Factory.pattern;

public class App {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();
        Fruit apple = fruitFactory.provideFruit("Apple");
        Fruit banana = fruitFactory.provideFruit("Banana");
        Fruit orange = fruitFactory.provideFruit("Orange");

        apple.produceJuice();
        banana.produceJuice();
        orange.produceJuice();
    }
}
