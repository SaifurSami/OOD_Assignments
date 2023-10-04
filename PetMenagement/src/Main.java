public class Main {
    public static void main(String[] args) {
        Food fishFood = new FishFood();
        Food dogFood = new DogFood();
        Food catFood = new CowFood();
        Food birdFood = new BirdFood();

        Dog dog = new Dog();
        dog.name = "Spike";
        dog.eat(dogFood);
        System.out.println(dog.name + " lives on " + dog.livesIn);
        System.out.println(dog.name + " reproduces " + dog.reproduce());
        System.out.println();

        Cow cow = new Cow();
        cow.name = "Mini";
        cow.eat(catFood);
        System.out.println(cow.name + " lives on " + cow.livesIn);
        System.out.println(cow.name + " reproduces " + cow.reproduce());
        System.out.println();

        Whale  whale = new Whale();
        whale.name = "Whaly";
        whale.eat(fishFood);
        System.out.println(whale.name + " lives in " +whale.livesIn);
        System.out.println(whale.name + " reproduces " + whale.reproduce());
        System.out.println();

        Hilsa hilsa = new Hilsa();
        hilsa.name = "Hilshy";
        hilsa.eat(fishFood);
        System.out.println(hilsa.name + " lives in " +hilsa.livesIn);
        System.out.println(hilsa.name + " reproduces " + hilsa.reproduce());
        System.out.println();

        Hilsa nemo = new Hilsa("Nemo", 2);
        nemo.eat(fishFood);
        System.out.println(nemo.name + " lives in " + nemo.livesIn);
        System.out.println(nemo.name + " reproduces " +nemo.reproduce());
        System.out.println();
        
        Crow crow = new Crow();
        crow.name = "Kak";
        crow.eat(birdFood);
        System.out.println(crow.name + " Lives in " + crow.livesIn);
        System.out.println(crow.name + " reproduces " + crow.reproduce());
        System.out.println();


    }
}