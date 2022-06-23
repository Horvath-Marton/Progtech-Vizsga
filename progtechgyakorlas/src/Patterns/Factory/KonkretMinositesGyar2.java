package Patterns.Factory;

public class KonkretMinositesGyar2 extends MinositesGyar{
    @Override
    public Minosites Minosit() {
        return new B_Minosites();
    }
}
