public class TrafficLightSimulator {
    public enum LightState {
        RED("Stop", 30),
        YELLOW("Caution", 5),
        GREEN("Go", 45);

        private final String action;
        private final int duration;

        LightState(String action, int duration) {
            this.action = action;
            this.duration = duration;
        }

        public String getAction() {
            return action;
        }

        public int getDuration() {
            return duration;
        }
    }

    public static void main(String[] args) {
        for (LightState state : LightState.values()) {
            System.out.println(state + ": " + state.getAction() + " for " + state.getDuration() + " seconds");
        }
    }
}

