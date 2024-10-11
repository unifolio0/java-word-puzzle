package wordpuzzle;

public class Step {

    private final int step;

    private Step(int step) {
        this.step = step;
    }

    public static Step startStep() {
        return new Step(1);
    }

    public Step nextStep() {
        return new Step(step + 1);
    }

    public boolean isPlay() {
        return step <= 3;
    }
}
