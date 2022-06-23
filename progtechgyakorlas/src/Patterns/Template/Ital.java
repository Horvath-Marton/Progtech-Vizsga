package Patterns.Template;

import javax.swing.*;

public abstract class Ital {
    public void Makin(){
        boiling();
        pour();
        sweetening();
        stirring();
    }
    private void boiling(){ System.out.println(" Boiling the water");}
    private void pour(){System.out.println("Pouring the water into a cup");}
    private void sweetening(){};
    protected abstract void stirring();
}
