public class Cat implements Participant {
    public final int maxDistance = 200;
    public final int maxHeight = 1;

    @Override
    public void run(int distance) {
        if (distance <= maxDistance) {
            System.out.println("Cat running " + distance);
        } else {
            System.out.println("The cat leaves the competition ");
        }
    }
        @Override
        public void jumping ( int height){
            if (height <= maxHeight) {
                System.out.println("Cat jumping " + height);
            } else {
                System.out.println("The cat leaves the competition ");
            }
        }
    }




