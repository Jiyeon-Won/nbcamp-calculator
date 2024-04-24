import java.util.ArrayList;

public class CircleCalculator extends Calculator {

    static final double PI = 3.14;

    public CircleCalculator(ArrayList<Double> list) {
        super(list);
    }

    public double calculateCircleArea(int radius) {
        return radius * radius * PI;
    }

}