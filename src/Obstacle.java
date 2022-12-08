public abstract class Obstacle {
    String name;
    double height;
    double length;

    public Obstacle(final String name, final double height, final double length) {
        this.name = name;
        this.height = height;
        this.length = length;
    }
    public String getName(){
        return this.name;
    }
   public abstract void overcome(Participant participant);
}

