public class Planet {
    private String name;
    private Double size;
    public Planet(String name, Double size){
        this.name = name;
        this.size = size;
    }
    public String getName(){
        return this.name;
    }
    public double getSize(){
        return this.size;
    }
    public String explode(){
        return String.format("Boom! %s exploded!",name);
    }


}
