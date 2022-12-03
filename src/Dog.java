public class Dog extends Animals {

    @Override
    public void run(int obstacleLength) {
        super.run(obstacleLength);
        if (obstacleLength > 500) {
            System.out.println("Dog Barsik say: I not run more 500 m");
        } else {
            System.out.println("Dog Barsik run " + obstacleLength);
        }
    }

    @Override
    public void swim(int obstacleLength) {
        super.swim(obstacleLength);
        if (obstacleLength > 10) {
            System.out.println("Dog say: I not swim more 10 m");
        } else {
            System.out.println("Dog swim " + obstacleLength);
        }
    }

}
