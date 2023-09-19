public class Bear {
    private String name;
   private int age;
    private double weight;
    private double height;
    public Bear(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getWeight(){
        return this.weight;
    }

    public double getHeight(){
        return this.height;
    }
    public boolean readyToHibernate(){
        if (this.weight >= 80.00){
            return true;
        } else {
            return false;
        }
    }
}
