package Patterns.Strategy;

public class GumiKacsa extends Kacsa{
    public GumiKacsa() {
        this.hapogasStrategy = new NemNormalHapogas();
    }
}
