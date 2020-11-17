public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;
        for (int i = 0; (Math.abs(x) + Math.abs(y)) < r; i++) {
            System.out.println("(" + x + "," + y + ")");
            double random = Math.random();
            int dirc = (int) (random * 4);

            if (dirc < 1) {
                x += 1;
            } else if (dirc < 2) {
                x -= 1;
            } else if (dirc < 3) {
                y += 1;
            } else if (dirc < 4) {
                y -= 1;
            }
            steps += 1;
        }
        System.out.println("(" + x + "," + y + ")");
        System.out.println("steps = " + steps);
    }
}
