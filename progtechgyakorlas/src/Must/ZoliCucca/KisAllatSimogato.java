package Must.ZoliCucca;

import java.util.ArrayList;

public class KisAllatSimogato {

    private ArrayList<Cica> cicak = new ArrayList<>();

    // Kevesebb Felelősség

    public void removeCica(Cica c){
        cicak.remove(c);
    }
    public ArrayList getCicak(){
        return cicak;
    }

    //Elegendő felelősség.
/*
    public void addCica(Cica c){
        cicak.add(c);
    }
*/


    // Túl sok felelősség

    public Cica mostSzuletettCica(String nev){
        return new Cica(nev,0);
    }
    public void cicaNevModosit(Cica c, String ujNev){
        c.setNev(ujNev);
    }
}
