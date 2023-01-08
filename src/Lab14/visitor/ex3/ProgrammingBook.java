package Lab14.visitor.ex3;

public abstract class ProgrammingBook extends Book{
    public ProgrammingBook(double price) {
        super(price);
    }

    public abstract String getResource();
}
