
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder result = new StringBuilder("{\n");
        final int breaker = 4;
        for (int i = 0; i < t.length; i++) {
            result.append(" ").append(t[i]);
            if (i != t.length - 1)
                result.append(",");
            if ((i + 1) % breaker == 0)
                result.append("\n");
        }
        if (t.length % breaker != 0)
            result.append("\n");
        return result.append("}").toString();
    }
}
