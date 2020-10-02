public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double a = 0;
        for (int i = 1; i <= n; i++) {
            a += 1 / (Math.pow(i, r));
        }
        System.out.println(a);
    }
}
