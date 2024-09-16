public class Transport {

    private final String modelName;
    private final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre(Transport transport) {
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }

    public void checkEngine(Transport transport) {
        if (transport.getClass().equals(Car.class) || transport.getClass().equals(Truck.class)) {
            System.out.println("Проверяем двигатель");
        }
    }

    public void checkTrailer(Transport transport) {
        if (transport.getClass().equals(Truck.class))
            System.out.println("Проверяем прицеп");
    }

    public void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        updateTyre(transport);
        checkEngine(transport);
        checkTrailer(transport);
    }

}
