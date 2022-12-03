public class Cat extends Animals {
    @Override
    public void run(int obstacleLength) {
        super.run(obstacleLength);
        if (obstacleLength > 200) {
            System.out.println("Cat Murzik say: I not run more 500 m");
        } else {
            System.out.println("Cat Murzik run " + obstacleLength);
        }
    }

    @Override
    public void swim(int obstacleLength) {
        super.swim(obstacleLength);
        if (obstacleLength != 0) {
            System.out.println("Cat Murzik say: I not swim");
        } else {
            return;
        }
    }
}
