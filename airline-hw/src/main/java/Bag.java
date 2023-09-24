public enum Bag {
    SMALL_BAG(5.0),
    CABIN_BAG(10.0),
    CHECKED_BAGGAGE(25.0),
    CHECKED_BAGGAGE_LARGE(32.0);
    private Double weight;
    Bag(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }
}
