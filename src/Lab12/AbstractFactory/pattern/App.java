package Lab12.AbstractFactory.pattern;

public class App {
    public static void main(String[] args) {
        FactoryProducer producer = new FactoryProducer();

        AbstractFactory shapeFactory = producer.getFactory("normal");
        Shape ractangle = shapeFactory.getShape("Rectangle");
        ractangle.draw();
        Shape square = shapeFactory.getShape("Square");
        square.draw();
        System.out.println();

        AbstractFactory roundedShapeFactory = producer.getFactory("RoundedShape");
        Shape roundedRectangle = roundedShapeFactory.getShape("Rectangle");
        roundedRectangle.draw();
        Shape roundedSquare = roundedShapeFactory.getShape("Square");
        roundedSquare.draw();
        System.out.println();

    }
}