package Patterns.Template;

public class Main {
    public static void main(String[] args) {
        Tea t = new Tea();
        Coffe c = new Coffe();

        t.Makin();

        System.out.println();

        c.Makin();
        c.sweetening();

    }
}
