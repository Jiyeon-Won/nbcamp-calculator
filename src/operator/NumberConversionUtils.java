package operator;

public class NumberConversionUtils {

    @SuppressWarnings("unchecked")
    public static <T extends Number> T convertNumberToType(Number result) {
        if (result instanceof Integer) {
            return (T) result;
        } else if (result instanceof Double) {
            return (T) result;
        } else if (result instanceof Float) {
            return (T) result;
        } else if (result instanceof Long) {
            return (T) result;
        } else {
            throw new IllegalArgumentException("해당하는 연산자가 없습니다");
        }
    }
}