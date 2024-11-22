public class CompareNumbers {
    public enum Mode { NORMAL, OPPOSITES, RECIPROCALS }

    public static String compare(double A, double B, Mode mode) {
        switch (mode) {
            case NORMAL:
                return (A > B) ? "A" : (B > A) ? "B" : "Equal";
            case OPPOSITES:
                return (-A > -B) ? "A" : (-B > -A) ? "B" : "Equal";
            case RECIPROCALS:
                if (A == 0 || B == 0) throw new IllegalArgumentException("Division by zero is not allowed");
                double reciprocalA = 1 / A;
                double reciprocalB = 1 / B;
                return (reciprocalA > reciprocalB) ? "A" : (reciprocalB > reciprocalA) ? "B" : "Equal";
            default:
                throw new IllegalArgumentException("Invalid mode");
        }
    }
}
