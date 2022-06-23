package Patterns.Strategy;

public class Main {
    public static void main(String[] args) {
        Kacsa k1 = new GumiKacsa();
        k1.hapogas();
        Kacsa k2 = new NormalKacsa();
        k2.hapogas();
    }
}
