package Must.ZoliCucca;

public class CicaHozzaAdo {
    KisAllatSimogato kisAllatSimogato;

    public CicaHozzaAdo(KisAllatSimogato kisAllatSimogato) {
        this.kisAllatSimogato = kisAllatSimogato;
    }

    public void hozzaAd(Cica cica){
        kisAllatSimogato.getCicak().add(cica);
    }
}
