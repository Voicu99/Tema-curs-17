public enum CarType {
    SEDAN("Toyota", 20000),
    SUV("Ford", 35000),
    TRUCK("Chevrolet", 40000);

    private final String manufacturer;
    private final int averagePrice;

    CarType(String manufacturer, int averagePrice) {
        this.manufacturer = manufacturer;
        this.averagePrice = averagePrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getAveragePrice() {
        return averagePrice;
    }

    @Override
    public String toString() {
        return name() + " from " + manufacturer + " costs around $" + averagePrice;
    }

    public static void main(String[] args) {
        for (CarType type : CarType.values()) {
            System.out.println(type);
        }
    }
}

