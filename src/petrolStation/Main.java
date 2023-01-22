package petrolStation;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int maxFuel = 10000;
        AmountStation amount = new AmountStation(maxFuel);
        Thread thread1 = new Thread(new PetrolStation(amount, 50), "BMW ");
        Thread thread2 = new Thread(new PetrolStation(amount, 80), "MB ");
        Thread thread3 = new Thread(new PetrolStation(amount, 60), "AUDI ");
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
    }
}

