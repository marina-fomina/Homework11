public class BunchOfFlowers {

    private final Flower[] flowers;

    public BunchOfFlowers(Flower[] flowers) {
        this.flowers = flowers;
    }

    public float getCostOfBunch() {
        float total = 0;
        for (Flower flower : flowers) {
            if (flower != null || !flower.getFlowerName().isBlank()) {
                total = total + flower.getCost();
            }
        }
        return total * 1.1f;
    }

    public int getLifeSpanOfBunch() {
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower != null && flower.getLifeSpan() < minLifeSpan) {
                minLifeSpan = flower.getLifeSpan();
            }
        }
        return minLifeSpan;
    }
}
