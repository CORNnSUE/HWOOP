package Lab7.ex16;

public class BigDog extends Animal {
    public BigDog (String name){
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wooow");
    }
    public void greets(BigDog anotherBigDog){
        System.out.println("Woooooow");
    }
    public void greets(Dog anotherDog){
        System.out.println("Wooooooooooow");
    }

}
