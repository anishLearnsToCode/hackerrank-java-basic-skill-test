import java.util.Arrays;

public class HowWillYouCompare {
    private static class Comparator {
        public boolean compare(int a, int b) {
            return a == b;
        }

        public boolean compare(String a, String b) {
            return a.equals(b);
        }

        public boolean compare(int[] a, int[] b) {
            return Arrays.equals(a, b);
        }
    }
}
