package Patterns.Factory;

public class KonkretMinositesGyar1 extends MinositesGyar{
    @Override
    public Minosites Minosit() {
        return new A_Minosites();
    }
}
