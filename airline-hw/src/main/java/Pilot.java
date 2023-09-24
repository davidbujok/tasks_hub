public class Pilot extends CabinCrewMember{
    private String licenceNo;

    public Pilot(String name, Rank rank, String licenceNo) {
        super(name, rank);
        this.licenceNo =  licenceNo;
    }
    public String getLicenceNo() {
        return licenceNo;
    }
    public String startFlight(){
        return "whir whir buzzzz";
    }
}
