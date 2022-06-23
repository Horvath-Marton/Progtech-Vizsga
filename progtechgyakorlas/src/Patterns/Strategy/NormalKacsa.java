package Patterns.Strategy;

public class NormalKacsa extends Kacsa{
    public NormalKacsa() {
        this.hapogasStrategy = new NormalHapogas();
    }
}
