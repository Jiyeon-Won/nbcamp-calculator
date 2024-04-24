public class CircleCalculator extends Calculator {

    private static final CircleCalculator instance = new CircleCalculator();
    private CircleCalculator() {
    }

    public static CircleCalculator getInstance() {
        return instance;
    }
}