public class Car extends Transport implements Serviceable {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        this.updateTyre();
        System.out.println("Проверяем двигатель");
    }
}
