package Animals;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("CatsCategory");
        Cat cat = new Cat("Marry", 200, false, 2);
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animal big_animal = new Animal("Dogs");
        Dog dog = new Dog("Jack", 500, 10, 0.5);
        big_animal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();

    }
}
