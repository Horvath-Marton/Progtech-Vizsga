package Patterns.Template;

public class Coffe extends Ital{

    @Override
    protected void stirring() {
        System.out.println("Stirring the coffe");
    }
    public void sweetening(){
        System.out.println("Sweetening the coffe");
    }
}
