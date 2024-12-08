public class App {
    public static void app01(int t, double v, double j) {
        double sum = v * Math.pow((1 + j), t);
        System.out.println(sum);
    }

    public static void app02(int t, double v, double j) {
        double sum = v / Math.pow((1 + j), t);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        // 01
        app01(10, 1200, 0.09);
        app01(8, 2000, 0.1);

        // 02
        app02(10, 12000, 0.08);
        app02(12, 14000, 0.08);
    }
}