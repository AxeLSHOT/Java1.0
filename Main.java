package New_Animals;


public class Main {
    public static
    void main(String[] args) {
        Cat[] cats = {new Cat("Marry", 50),
                new Cat("John", 50),
                new Cat("Megan", 25),
                new Cat("Alex", 5),
                new Cat("Eva", 1)};

        Plate plate = new Plate( 80);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}
