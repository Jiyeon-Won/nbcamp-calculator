package operator;

public class AddOperator<T extends Number> implements Operator<T> {
    public double operate(T num1, T num2) {
        return num1.doubleValue() + num1.doubleValue();



        // Unchecked cast: 'java.lang.Integer' to 'T'
//        if (num1 instanceof Integer) {
//            return (T) (Integer) (num1.intValue() + num2.intValue());
//        } else if (num1 instanceof Double) {
//            return (T) (Double) (num1.doubleValue() + num2.doubleValue());
//        } else if (num1 instanceof Float) {
//            return (T) (Float) (num1.floatValue() + num2.floatValue());
//        } else if (num1 instanceof Long) {
//            return (T) (Long) (num1.longValue() + num2.longValue());
//        }
    }
}