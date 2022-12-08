public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.run(200);
        robot.jumping(1);

        Cat cat = new Cat();
        cat.run(20);
        cat.jumping(1);

        Human human = new Human();
        human.run(150);
        human.jumping(3);

        Participant[] participant = new Participant[]{
                new Robot(),
                new Cat(),
                new Human(),
        };
        Let []let=new Let[]{
                new Wall(),
                new Treadmill(),
        };
        for (int i = 0; i<participant.length;i++){
            for (int j=0;j<let.length;j++);
        }




    }

}

