package CompositionAggregation;

public class Car {
    private Engine engine;

    Car() {
        engine = new Engine(); // Composition: Engine is created inside Car
    }
    void startCar() {
        engine.start();;
        System.out.println("Car started");
    }
}
