package Patterns.Decorator;

public class Main {
    public static void main(String[] args) {
       Coffe coffe = new Espresso();
       System.out.println(coffe.getDescription() + " "+ coffe.getAr() + "FT");

       Coffe WithMilkAndSugar = new Milk(new Sugar(coffe));
       System.out.println(WithMilkAndSugar.getDescription() + " "+ WithMilkAndSugar.getAr() + "FT");

    }
}
