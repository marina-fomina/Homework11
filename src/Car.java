public class Car {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        checkConditions();
    }

    @Override
    public String toString() {
        return "Автомобиль " + brand + " " + model + " " + productionYear + " года выпуска. Страна сборки - " + productionCountry + ". Цвет кузова - " + color + ". Объем двигателя - " + engineVolume + " литра.";
    }

    public void checkConditions() {
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (productionCountry == null || productionCountry.isBlank()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
    }

}
