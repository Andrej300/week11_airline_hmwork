public class CabinCrewMember extends Person {

    private RankType rank;



    public CabinCrewMember(String name, RankType rank) {
        super(name);
        this.rank = rank;
    }


    public RankType getRank() {
        return this.rank;
    }

}
