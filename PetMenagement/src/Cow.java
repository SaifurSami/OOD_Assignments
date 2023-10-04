public class Cow extends TeristrialAnimal implements Mammal{
    public Cow(){}
    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public String reproduce() {
        return birthType;
    }
}