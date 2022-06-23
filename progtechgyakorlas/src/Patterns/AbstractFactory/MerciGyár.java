package Patterns.AbstractFactory;

public class MerciGyár extends AutoGyár{
    @Override
    public Alváz CreateAlváz() {
        return new MerciAlváz();
    }

    @Override
    public Motor CreateMotor() {
        return new MerciMotor();
    }
}
