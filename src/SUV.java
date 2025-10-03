public class SUV extends Car {
    public SUV(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.println("Driving an SUV with " + engine.getType());
    }
}