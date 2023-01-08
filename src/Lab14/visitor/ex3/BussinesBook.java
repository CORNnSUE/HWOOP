package pattern.visitor.ex3;

public class BussinesBook extends Book{
    private String publisher;

    public BussinesBook(double price, String publisher) {
        super(price);
        this.publisher = publisher;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getPublisher() {
        return this.publisher;
    }
}
