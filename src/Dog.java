public class Dog extends Animals {
    private final int maxDistanceRun = 500;
    private final int maxDistanceSwim = 10;
    private static int dogCount;

    @Override
    public void run(int obstacleLength) {
        super.run(obstacleLength);
        if (obstacleLength > maxDistanceRun) {
            System.out.println("Dog say: I not run more " + maxDistanceRun +" m");
        } else {
            System.out.println("Dog run " + obstacleLength);
        }
    }
    @Override
    public void swim(int obstacleLength) {
        super.swim(obstacleLength);
        if (obstacleLength > maxDistanceSwim) {
            System.out.println("Dog say: I not swim more " +maxDistanceSwim + " m");
        } else {
            System.out.println("Dog swim " + obstacleLength);
        }
    }
    public Dog() {
        incrementDogCount();
    }
    public static void incrementDogCount() {
        Dog.dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}
