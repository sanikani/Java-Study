package part1;

public class TriFunctionExample {

    public static void main(String[] args) {
        TriFunction<String, String, String, Color> c3 = Color::new;
        Color color = c3.apply("red", "green", "blue");
    }

    static class Color {
        String a;
        String b;
        String c;

        public Color(String a, String b, String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
