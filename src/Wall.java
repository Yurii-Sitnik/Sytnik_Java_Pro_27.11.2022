public class Wall extends Obstacle {

    public Wall(double height) {
        super("Wall",height,0);
    }
    @Override
    public void overcome(Participant participant) {
        if (participant.getMaxJump()>length){
            participant.jump();
            System.out.println("participant" + participant.getName()+" passed the obstacle "+ getName() + " at a height "+ height);
        }else {
            participant.setFail();
            System.out.println("participant" + participant.getName()+" NO PASSED the obstacle "+ getName() + " at a height "+height+" passed "+participant.getMaxJump());
            System.out.println(participant.getName()+ " cannot jump");
        }
    }
}

