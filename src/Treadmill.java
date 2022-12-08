public class Treadmill extends Obstacle {

    public Treadmill(double length) {
        super("Treadmill", 0, length);
    }
    @Override
    public void overcome(Participant participant) {
        if (participant.getMaxRun() > length) {
            participant.run();
            System.out.println("participant" + participant.getName()+" passed the obstacle "+ getName() + " at a distance "+length);
        } else {
            participant.setFail();
            System.out.println("participant" + participant.getName()+" NO PASSED the obstacle "+ getName() + " at a distance "+length+" Passed "+participant.getMaxRun());
            System.out.println(participant.getName()+ " cannot run");
        }
    }
}



