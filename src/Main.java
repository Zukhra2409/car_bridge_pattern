public class Main {
    public static void main(String[] args) {
        Car sedan = new Sedan(new PetrolEngine());
        sedan.drive();

        Car suv = new SUV(new ElectricEngine());
        suv.drive();
    }
}
