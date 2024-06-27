package prometheus.olimpiatasks.number13;

public final class CustomMathUtils {
    private CustomMathUtils() {}

    public static int gcd(int a, int b) {
        if (a <= 0 || b <= 0) {
            return -1;
        }
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        if (a <= 0 || b <= 0) {
            return -1;
        }
        return (a * b) / gcd(a, b);
    }
}
