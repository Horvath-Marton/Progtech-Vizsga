package Patterns.Factory;

public class Main {
    public static void main(String[] arg){
        MinositesGyar[] minosito = new MinositesGyar[2];
        minosito[0] = new KonkretMinositesGyar1();
        minosito[1] = new KonkretMinositesGyar2();
        for (MinositesGyar m:minosito) {
            Minosites minosites = m.CreateMinosites();
            minosites.Minosit();
        }
    }
}
