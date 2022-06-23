package Patterns.Decorator;

public class Espresso implements Coffe{
    @Override
    public int getAr() {
        return 320;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
