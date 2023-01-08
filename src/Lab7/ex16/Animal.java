package Lab7.ex16;

public abstract class Animal {
    private String name;
    public abstract void greets();

    public Animal(String name) {
        this.name = name;
    }
}
