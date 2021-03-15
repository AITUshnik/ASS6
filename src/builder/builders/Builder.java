package builder.builders;
//Builder for Me was the hardest pattern
// So we build the the by parts
// We need this interface because we have a lot components of car and we need implement them
import builder.cars.CarType;
import builder.components.Engine;
import builder.components.GPSNavigator;
import builder.components.Transmission;
import builder.components.TripComputer;


//This Builder interface defines all possible ways to configure a product.

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
