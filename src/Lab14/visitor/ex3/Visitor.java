package pattern.visitor.ex3;

public interface Visitor {
    void visit(BussinesBook book);
    void visit(DesignPatternBook book);
    void visit(JavaCoreBook book);
}
