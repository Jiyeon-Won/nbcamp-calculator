public class ArithmeticCalculator extends Calculator {

    private static final ArithmeticCalculator instance = new ArithmeticCalculator();
    private ArithmeticCalculator() {
    }

    public static ArithmeticCalculator getInstance() {
        return instance;
    }
}