package Lab13.Builder;


public interface Builder {
    Builder setCarType(CarType carType);
    Builder reset();
    Builder setSeats(int seats);
    Builder setEngine(Engine engine);
    Builder setTripComputer(TripComputer tripComputer);
    Builder setGPS(GPS gps);
}

