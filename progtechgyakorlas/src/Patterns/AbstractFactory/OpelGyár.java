package Patterns.AbstractFactory;

public class OpelGyár extends AutoGyár{
    @Override
    public Alváz CreateAlváz() {
        return new OpelAlváz();
    }

    @Override
    public Motor CreateMotor() {
        return new OpelMotor();
    }
}
