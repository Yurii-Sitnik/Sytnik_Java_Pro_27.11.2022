public class Cat extends Animals {
    private final int maxDistanceRun = 200;
    private final int getMaxDistanceSwim = 0;
    private static int catCount;
    @Override
    public void run(int obstacleLength) {
        super.run(obstacleLength);
        if (obstacleLength > 200) {
            System.out.println("Cat say: I not run more " + maxDistanceRun + "m");
        } else {
            System.out.println("Cat run " + obstacleLength);
        }
    }
    @Override
    public void swim(int obstacleLength) {
        super.swim(obstacleLength);
        if (obstacleLength != getMaxDistanceSwim) {
            System.out.println("Cat say: I not swim");
        } else {
            return;
        }
    }
    public Cat() {
        incrementCatCount();
    }
    public static void incrementCatCount() {
        Cat.catCount++;
    }
    public static int getCatCount() {
        return catCount;
    }
}
