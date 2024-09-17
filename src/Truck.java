public class Truck extends Transport implements Serviceable {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        this.updateTyre();
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }
}
