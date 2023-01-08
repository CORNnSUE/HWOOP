package AbstractFactory.pattern;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (type.equals("Rectangle")) {
            return new RoundedRectangle();
        } else if (type.equals("Square")) {
            return new RoundedSquare();
        } else {
            return null;
        }
    }
}