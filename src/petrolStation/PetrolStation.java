package petrolStation;

public class PetrolStation implements Runnable {
    private final AmountStation amount;
    private int fuel;

    public PetrolStation(AmountStation petrolAmount, int fuel) {
        this.amount = petrolAmount;
        this.fuel = fuel;
    }

    @Override
    public void run() {
        System.out.println("Starting refuel " + Thread.currentThread().getName() + fuel + " liters");
        try {
            Thread.sleep((long) ((Math.random() * 8) + 3) * 1000);
            if (doRefuel() <= 0) {
                System.out.println(" No fuel " + Thread.currentThread().getName());
            } else {
                System.out.println(" Refuel finish " + Thread.currentThread().getName() + " remainder fuel " + doRefuel() + " liters");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private int doRefuel() {
        synchronized (this) {
            amount.setAmount(amount.getAmount() - fuel);
            return amount.getAmount();
        }
    }
}
