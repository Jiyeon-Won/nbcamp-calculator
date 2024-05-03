package operator;

public class NumberConversionUtils {

    @SuppressWarnings("unchecked")
    public static <T extends Number> T convertNumberToType(Number result) {
        if (result instanceof Integer) {
            return (T) result;
//            return (T) Integer.valueOf(result.intValue());
        } else if (result instanceof Double) {
            return (T) result;
//            return (T) Double.valueOf(result.doubleValue());
        } else if (result instanceof Float) {
            return (T) result;
//            return (T) Float.valueOf(result.floatValue());
        } else if (result instanceof Long) {
            return (T) result;
//            return (T) Long.valueOf(result.longValue());
        } else {
            throw new IllegalArgumentException("해당하는 연산자가 없습니다");
        }
    }
}