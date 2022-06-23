package Patterns.Decorator;

public class Sugar extends CoffeDecorator{
    Coffe coffe;
    public Sugar(Coffe coffe){
        this.coffe = coffe;
    }

    @Override
    public int getAr() {
        return this.coffe.getAr() +1;
    }

    @Override
    public String getDescription() {
        return this.coffe.getDescription() + " with Sugar";
    }
}
