public abstract class Participant {
    private String name;
    private double maxJump;
    private double maxRun;
    private boolean hasFailed = false;

    public String getName() {
        return name;
    }
    public double getMaxJump() {
        return maxJump;
    }
    public double getMaxRun() {
        return maxRun;
    }
   public boolean isFailed() {
       return hasFailed;
   }
    public Participant(String name, double maxJump, double maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }
    public void jump() {
        System.out.println("Our participant " + name + " jumped");
    }
    public void run() {
    System.out.println("Our participant " + name + " running");
    }
    public void setFail() {
        this.hasFailed = true;
    }
}

