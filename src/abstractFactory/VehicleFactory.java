package abstractFactory;

public interface VehicleFactory {
    Engine createEngine();
    Wheels createWheels();
    Chassis createChassis();
}


public class carFactory implements  VehicleFactory{

    @Override
    public Engine createEngine() {
        return null;
    }

    @Override
    public Wheels createWheels() {
        return null;
    }

    @Override
    public Chassis createChassis() {
        return null;
    }
}