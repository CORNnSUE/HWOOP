package pattern.visitor.demo;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
