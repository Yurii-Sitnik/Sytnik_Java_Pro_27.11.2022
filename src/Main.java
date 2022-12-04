public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        dog1.run(600);
        dog1.swim(9);

        dog2.run(200);
        dog2.swim(500);

        cat1.run(5);
        cat1.swim(1);

        cat2.run(25);
        cat2.swim(3);

        System.out.println("Animals "+Animals.getAnimalsCount());
        System.out.println("Dog "+Dog.getDogCount());
        System.out.println("Cat "+Cat.getCatCount());
    }
}
