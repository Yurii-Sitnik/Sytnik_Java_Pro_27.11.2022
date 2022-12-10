public class Main {
    public static void main(String[] args) {
        Human human = new Human("Niki", 1, 100);
        Robot robot = new Robot("Rob", 5, 350);
        Cat cat = new Cat("Murka", 6, 600);

        Wall wall = new Wall(3);
        Treadmill treadmill = new Treadmill(300);

        Obstacle[] obstacles = new Obstacle[]{wall, treadmill};
        Participant[] participants = new Participant[]{human, robot, cat};

        for (Participant participant : participants) {
            System.out.println("New participant " + participant.getName());
            {
                for (Obstacle obstacle : obstacles) {
                    System.out.println("New obstacle " + obstacle.getName());
                    obstacle.overcome(participant);
                    if (participant.isFailed()) {
                        break;
                    }
                }
            }
        }
    }
}

