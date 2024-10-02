public enum LightColor {
    RED("Stop", 30),
    YELLOW("Caution", 5),
    GREEN("Go", 45);

    private final String action;
    private final int duration;

    LightColor(String action, int duration) {
        this.action = action;
        this.duration = duration;
    }

    public String getAction() {
        return action;
    }

    public int getDuration() {
        return duration;
    }

    public static void main(String[] args) {
        for (LightColor color : LightColor.values()) {
            System.out.println(color.name() + ": " + color.getAction() + " for " + color.getDuration() + " seconds");
        }
    }
}

