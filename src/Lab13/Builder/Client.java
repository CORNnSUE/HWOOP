package Lab13.Builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.makeSportsCar(builder);

        Car car = builder.getProduct();
        System.out.println(car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.makeSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("car manual built: " + carManual.print());
    }
}

