package ex16;

public class TestMain {
    public static void main(String[] args) {

        Cat cat = new Cat("A");
        System.out.println("A's greeting");
        cat.greets();
        System.out.println("\n");

        Dog dog = new Dog("B");
        System.out.println("dog's greeting");
        dog.greets();
        System.out.println("B's greeting");
        dog.greets(dog);
        System.out.println("\n");

        BigDog bigDog = new BigDog("C");
        System.out.println("big dog's greeting");
        bigDog.greets();
        System.out.println("C's greeting");
        bigDog.greets(dog);
        System.out.println("D's greeting");
        bigDog.greets(new BigDog("D"));
    }
}