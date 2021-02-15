public enum PlaneType {

    BOEING747(200, 900),
    AIRBUSA380(300, 950),
    BOEING717(150,850);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }


    public int getPlaneTypeCapacity() {
        return this.capacity;
    }


}
