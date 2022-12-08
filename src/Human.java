public class Human implements Participant {
    public final int maxDistance = 500;
    public final int maxHeight = 2;

    @Override
    public void run(int distance) {
        if (distance <= maxDistance) {
            System.out.println("Human running " + distance);
        } else {
            System.out.println("The Human leaves the competition ");
        }
    }
    @Override
    public void jumping ( int height){
        if (height <= maxHeight) {
            System.out.println("Human jumping " + height);
        } else {
            System.out.println("The Human leaves the competition ");
        }
    }
}
