public class Assignment3 {

    static class Tea {
        double bird;
        void book(double watch) {
            this.bird = (watch - this.bird);
        }
        Tea (double snake) {
            this.bird = snake * 2;
        }
    }
    public static void main(String[ ] args) {
        Tea  m = new Tea(-2);
        Tea  n = new Tea(42);

        m.book(92);
        n.bird = m.bird + n.bird;
        System.out.println(n.bird);

        n.book(25);
        System.out.println(n.bird);

        n.book(25);
        System.out.println(n.bird);
    }
}


