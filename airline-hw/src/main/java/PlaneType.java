public enum PlaneType {
    AIRBUS_A380(853, 5600.00),
    BOEING_777(550, 4520.00),
    AIRBUS_A330(335, 26200.00),
    BOEING_787(290, 31700.00),
    BOEING_737(230, 22700.00),
    AIRBUS_A320(186, 16000.00),
    BOEING_767(245, 30100.00),
    EMBRAER_E195(124, 12100.00),
    BOMBARDIER_CRJ900(76, 7750.00),
    CESSNA_CITATION_X(8, 40000.00);

    private int capacity;
    private Double total_weight;


    PlaneType(int capacity, Double total_weight) {
        this.capacity = capacity;
        this.total_weight = total_weight;
    }
    public int getCapacity(){
        return this.capacity;
    }

    public Double getTotal_weight() {
        return total_weight;
    }
}
