package Transport;
import java.time.LocalDate;


public class Car {

    public static class Key {
        private final String remoteEngineStart;
        private final String accessWithoutKey;

        public Key(String remoteEngineStart, String accessWithoutKey) {
            this.remoteEngineStart = validOrDefault(remoteEngineStart, DEFAULT_VALUE);
            this.accessWithoutKey = validOrDefault(accessWithoutKey, DEFAULT_VALUE);
        }
    }

    public static class Insurance {
        private final LocalDate validUntil;
        private final int price;
        private final String number;

        public Insurance(LocalDate validUntil, int price, String number) {
            this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(10);
            this.price = Math.max(price, 1_000);
            this.number = validOrDefault(number, DEFAULT_VALUE);
        }

        public boolean isInsuranceValid() {
            return LocalDate.now().isBefore(this.validUntil);
        }

        public boolean isNumberValid() {
            return number.length() == 9;
        }
        }

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;

    private static final String DEFAULT_VALUE = "default";
    private final String bodyType;

    private final int seatsNumber;

    private String transmission;

    private String registrationNumber;

    private boolean winterTyres;

    private Key key;

    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry,
               String bodyType, int seatsNumber, String transmission, String registrationNumber, boolean winterTyres,
               Key key, Insurance insurance) {
        this.brand = validOrDefault(brand, DEFAULT_VALUE);
        this.model = validOrDefault(model, DEFAULT_VALUE);
        setEngineVolume(engineVolume);
        setColor(color);
        this.productionYear = productionYear >= 0 ? productionYear : 2000;
        this.productionCountry = validOrDefault(productionCountry, DEFAULT_VALUE);
        this.bodyType = validOrDefault(bodyType, DEFAULT_VALUE);
        this.seatsNumber = seatsNumber > 0 ? seatsNumber : 4;
        setTransmission(transmission);
        setRegistrationNumber(registrationNumber);
        setWinterTyres(winterTyres);
    }

    private static String validOrDefault(String value, String defaultValue) { // Пришлось написать метод для валидации значений полей,
        // т.к. в классе Car не вызывается класс ValidationUtils. Сделала его статическим, чтобы можно было использовать во вложенном классе Key.
        if (value == null || value.isBlank()) {
            return defaultValue;
        }
        return value;
    }

    @Override
    public String toString() {
        return "Автомобиль " + brand + " " + model + " " + productionYear + " года выпуска. Страна сборки - " + productionCountry +
                ". Цвет кузова - " + color + ". Объем двигателя - " + engineVolume + " литра. Тип кузова - " + bodyType +
                ". Количество мест - " + seatsNumber + ". Коробка передач - " + transmission + ". Регистрационный номер - " +
                registrationNumber + ". Установлена зимняя резина - " + winterTyres + ".";
    }

    public void setSeasonTyres() {
        int currentMonth = LocalDate.now().getMonthValue();
        if (currentMonth <= 3 || currentMonth >= 11 != this.winterTyres) {
            System.out.println("Нужно поменять резину.");
        } else {
            System.out.println("Сезонные шины установлены.");
        }

    }

    public boolean checkRegistrationNumber() {
        if (this.registrationNumber.length() != 9) {
            return false;
        }
        char [] registrationNumberChars = this.registrationNumber.toCharArray();
        return  isNumberLetter(registrationNumberChars[0]) && isNumber(registrationNumberChars[1])
                && isNumber(registrationNumberChars[2]) && isNumber(registrationNumberChars[3])
                && isNumberLetter(registrationNumberChars[4]) && isNumberLetter(registrationNumberChars[5])
                && isNumber(registrationNumberChars[6]) && isNumber(registrationNumberChars[7])
                && isNumber(registrationNumberChars[8]);
    }

    private boolean isNumber(char symbol) {
        return symbol >= '0' && symbol <= '9';
    }

    private boolean isNumberLetter(char symbol) {
        String allowedSymbols = "АВЕКМНОРСТУХ";
        return allowedSymbols.contains("" + symbol);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = validOrDefault(color, "белый");
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume > 0.0 ? engineVolume : 1.5;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = validOrDefault(transmission, DEFAULT_VALUE);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = validOrDefault(registrationNumber, DEFAULT_VALUE);
    }

    public boolean getWinterTyres() {
        return winterTyres;
    }

    public void setWinterTyres(boolean winterTyres) {
        this.winterTyres = winterTyres;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }
}
