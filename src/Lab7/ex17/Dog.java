package Lab7.ex17;

public class Dog extends Animal{
    @Override
    public void greeting() {
        System.out.println("Woof!");
    }
    public void greeting(Dog anotherDog){
        System.out.println("Woooof!");
    }
}
