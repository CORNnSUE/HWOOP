package Lab12.AbstractFactory.pattern;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (type.equals("Rectangle")) {
            return new Rectangle();
        } else if (type.equals("Square")) {
            return new Square();
        } else {
            return null;
        }
    }
}