public class Robot implements Participant {
    public final int maxDistance = 1000;
    public final int maxHeight = 3;

    @Override
    public void run(int distance) {
        if (distance <= maxDistance) {
            System.out.println("Robot running " + distance);
        } else {
            System.out.println("The Robot leaves the competition ");
        }
    }
    @Override
    public void jumping ( int height){
        if (height <= maxHeight) {
            System.out.println("Robot jumping " + height);
        } else {
            System.out.println("The Robot leaves the competition ");
        }
    }

}
