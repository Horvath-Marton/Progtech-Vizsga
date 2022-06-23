package Patterns.AbstractFactory;

public class Main {
    public static void main(String[] arg){
        AutoGyár gyár = new OpelGyár();
        Alváz alváz1 = gyár.CreateAlváz();
        Motor motor1 = gyár.CreateMotor();


        if (motor1.getClass().equals(OpelMotor.class) &&
                alváz1.getClass().equals(OpelAlváz.class)){
            System.out.println("Ez egy opel");
        }
        else System.out.println("Ez nem egy opel");
    }
}
