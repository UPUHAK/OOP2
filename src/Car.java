public class Car extends Transport implements CheckEngine {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        this.updateTyre();
        this.checkEngine();
    }
}
