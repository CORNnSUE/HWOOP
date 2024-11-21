package AbstractFactory.pattern;

public class FactoryProducer {
    public AbstractFactory getFactory(String type) {
        if (type.equals("RoundedShape")) {
            return new RoundedShapeFactory();
        }
        return new ShapeFactory();
    }
}