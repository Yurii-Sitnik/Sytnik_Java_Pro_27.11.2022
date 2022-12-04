public class Animals {
    private static int animalsCount;
    public Animals() {
        incrementAnimalsCount();
    }
    public void run(int obstacleLength) {
    }
    public void swim(int obstacleLength) {
    }
    public static int getAnimalsCount() {
        return animalsCount;
    }
    public static void incrementAnimalsCount() {
        Animals.animalsCount++;
    }
}
