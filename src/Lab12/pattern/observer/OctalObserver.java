package Lab12.pattern.observer;

public class OctalObserver extends Observer{
    private String octal;

    public OctalObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    @Override
    public void update() {
        octal = convertDecimalToOctal(subject.getState());
    }

    private String convertDecimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    @Override
    public String toString() {
        return this.octal;
    }
}
