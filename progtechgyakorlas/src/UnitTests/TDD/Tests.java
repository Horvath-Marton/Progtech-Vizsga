package UnitTests.TDD;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Tests {
    @Test
    public void MonogramNameTest()throws MyNameEmptyException
    {
        NevMonogram monogram = new NevMonogram();
        boolean flag = false;
        String nev = "Kis Nagy László";
        String expectedNev = "knl";
        assertEquals(expectedNev,monogram.Monogram(nev,flag) );
    }

    @Test
    public void MonogramWithTrueFlagTest()throws MyNameEmptyException
    {

        NevMonogram monogram = new NevMonogram();
        boolean flag = true;
        String nev = "dr. Kusper Gábor";
        String expectedNev = "dr. kg";
        assertEquals(expectedNev,monogram.Monogram(nev,flag) );
    }

    @Test
    public void MonogramWithFalseFlagTest()throws MyNameEmptyException
    {
        NevMonogram monogram = new NevMonogram();
        boolean flag = true;
        String nev = "dr. Lyuk Gábor";
        String expectedNev = "dr. lyg";
        assertEquals(expectedNev,monogram.Monogram(nev,flag) );
    }

    @Test
    public void MonogramWithKotojelTest()throws MyNameEmptyException
    {
        NevMonogram monogram = new NevMonogram();
        boolean flag = true;
        String nev = "dr. Kis-tóth lajos";
        String expectedNev = "dr. k-tl";
        assertEquals(expectedNev,monogram.Monogram(nev,flag) );
    }
    @Test
    public void testThrowsMyNullParamException() throws MyNameEmptyException
    {
        NevMonogram monogram = new NevMonogram();
        boolean flag = true;
        String nev = "";
        assertThrows( MyNameEmptyException.class, () -> {
            monogram.Monogram(nev,flag);
        });
    }
}
