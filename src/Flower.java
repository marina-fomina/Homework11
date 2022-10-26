public class Flower {

    private String flowerName;
    private String flowerColor;
    private String country;
    private float cost;
    private int lifeSpan;

    public Flower(String flowerName, String flowerColor, String country, float cost, int lifeSpan) {
        setFlowerName(flowerName);
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);
    }

    @Override
    public String toString() {
        return "Цветок - " + flowerName + ". Цвет - " + flowerColor + ". Страна происхождения - " + country + ". Стоимость штуки - "
                + cost + " рублей. Срок стояния - " + lifeSpan + " дней.";
    }


    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = ValidationUtils.validOrDefault(flowerName, "default");
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = ValidationUtils.validOrDefault(flowerColor, "белый");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = ValidationUtils.validOrDefault(country, "Россия");
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = Math.max(cost, 1);
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan > 0 ? lifeSpan : 3;
    }


}
