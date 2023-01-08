package ex17;

public class BigDog extends Dog {
    @Override
    public void greeting() {
        System.out.println("Woow!");
    }

    @Override
    public void greeting(Dog anotherDog) {
        System.out.println("Woooow!");
    }
}
