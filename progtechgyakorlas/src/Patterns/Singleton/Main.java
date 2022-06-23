package Patterns.Singleton;

public class Main {
    public static void main(String[] args){

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1.equals(s2)) System.out.println("Ugyanaz");
        else System.out.println("Nem ugyananz");
    }
}
