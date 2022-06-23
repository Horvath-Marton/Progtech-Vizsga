package Must.ZoliCucca;

import java.util.ArrayList;

public class Main {
    //Template, Strategy, szabadon választott.
    public static void main(String[] args) {
        KisAllatSimogato kisAllatSimogato = new KisAllatSimogato();
        System.out.println("Cicák: " + kisAllatSimogato.getCicak());

        CicaHozzaAdo cicaHozzaAdo = new CicaHozzaAdo(kisAllatSimogato);
        Cica c1 = new Cica("Cirmi",3);
        Cica c2 = new Cica("Folti",4);
        cicaHozzaAdo.hozzaAd(c1);
        cicaHozzaAdo.hozzaAd(c2);

        ArrayList<Cica> cicak = kisAllatSimogato.getCicak();

        for(Cica c : cicak){
            System.out.println("Név: " + c.getNev() + " | Életkor: " + c.getEletkor());
        }


    }
}