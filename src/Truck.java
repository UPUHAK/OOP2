public class Truck extends Transport implements CheckEngine, CheckTrailer {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        this.updateTyre();
        this.checkEngine();
        this.checkTrailer();
    }
}
