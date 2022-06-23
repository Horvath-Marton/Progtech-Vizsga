package UnitTests.Behelyettesites;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class BehelyettesitesTeszt {
    @Test
    public void testReplaceAllAsWithEs() throws MyNullParamException, MyNegativeParamExeption {
        String result;
        String bemenet = "alma";
        char keresettKarakter = 'a';
        char helyettesitoKarakter = 'e';
        int cserelendoElemek = 1;


        Behelyettesites behelyettesites = new Behelyettesites();
        result = behelyettesites.behelyettesit(bemenet, keresettKarakter, helyettesitoKarakter, cserelendoElemek);
        assertEquals("elme", result);

        bemenet = "almaaaaaaaaaaaaaaa";
        result = behelyettesites.behelyettesit(bemenet, keresettKarakter, helyettesitoKarakter, cserelendoElemek);
        assertEquals("elmeeeeeeeeeeeeeee", result);
    }

    @Test
    public void testReplaceEveryThirdAwithK() throws MyNullParamException, MyNegativeParamExeption{
        String result;
        String bemenet = "almaaaaaaaaaaaaa";
        char keresettKarakter = 'a';
        char helyettesitoKarakter = 'k';
        int cserelendoElemek = 3;

        Behelyettesites behelyettesites = new Behelyettesites();
        result = behelyettesites.behelyettesit(bemenet, keresettKarakter, helyettesitoKarakter, cserelendoElemek);

        assertEquals("almakaakaakaakaa", result);
    }

    @Test
    public void testNoCharsReplaced() throws MyNullParamException, MyNegativeParamExeption {
        String result;
        String bemenet = "alma";
        char keresettKarakter = 'a';
        char helyettesitoKarakter = 'k';
        int cserelendoElemek = 0;

        Behelyettesites behelyettesites = new Behelyettesites();
        result = behelyettesites.behelyettesit(bemenet, keresettKarakter, helyettesitoKarakter, cserelendoElemek);
        assertEquals("alma", result);
    }

    @Test
    public void testThrowsMyNullParamException() throws MyNullParamException, MyNegativeParamExeption{
        String bemenet = null;
        char keresettKarakter = 'a';
        char helyettesitoKarakter = 'k';
        int cserelendoElemek = 0;

        Behelyettesites behelyettesites = new Behelyettesites();
        assertThrows(MyNullParamException.class, () -> {
            behelyettesites.behelyettesit(bemenet, keresettKarakter, helyettesitoKarakter, cserelendoElemek);
        });
    }

    //@Test
    //void testNegativeException() {
    //    String bemenet = null;
    //    char keresettKarakter = 'a';
    //    char helyettesitoKarakter = 'k';
    //    int cserelendoElemek = 0;
//
    //    Behelyettesites behelyettesites = new Behelyettesites();
    //    assertThrows(MyNegativeParamExeption.class, behelyettesites.behelyettesit(bemenet, keresettKarakter, helyettesitoKarakter, cserelendoElemek));
    //}
//
}
