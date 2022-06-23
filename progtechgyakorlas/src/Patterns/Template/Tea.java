package Patterns.Template;

public class Tea extends Ital{

    @Override
    protected void stirring() {
        System.out.println("Stirring the tea");
    }
    public void sweetening(){
        System.out.println("Sweetening the tea");
    }
}
