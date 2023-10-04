public class Hilsa extends AquaticAnimal implements Oviparous {
    public Hilsa(){}

    public Hilsa(String name, int age){
        super(name, age);
    }
    @Override
    public String reproduce() {
        return birthType;
    }
}