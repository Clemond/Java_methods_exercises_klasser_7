public class Dog {
    
    private String name;        
    private String race;
    private double age;
    private double weight;
    private double tailLenght;


    public Dog(String name, String race, double age,double weight){
        this.name = name;
        this.race = race;
        this.age = age;
        this.weight = weight;

    }

    public String getName(){
        return this.name;
    }

}
