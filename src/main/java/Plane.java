public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }


    public PlaneType getType() {
        return this.planeType;
    }

    public int getCapacity() {
        return this.planeType.getPlaneTypeCapacity();
    }

    public int getTotalWeight() {
        return this.planeType.getPlaneTypeTotalWeight();
    }
}
