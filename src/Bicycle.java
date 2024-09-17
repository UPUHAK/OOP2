public class Bicycle extends Transport implements Serviceable {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        this.updateTyre();
    }
}
