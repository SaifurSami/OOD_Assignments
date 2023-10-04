public class Crow extends AvianAnimal implements Oviparous{

    public Crow(){}

    public  Crow(String name, int age){
        super(name, age);

    }
    @Override
    public String reproduce() {
        return birthType;
    }
}