package UnitTests.TDD;

public class NevMonogram {
    public String Monogram(String nev, boolean flag) throws MyNameEmptyException{

        String monogram = "";
        boolean countainsDot = false;

        if (nev == ""){
            throw new MyNameEmptyException("");
        }
        for (int i = 0; i<nev.length();i++ ){

            if(nev.charAt(i)==' ') {
                monogram += Character.toLowerCase(nev.charAt(i + 1));
                if(Character.toLowerCase(nev.charAt(i + 2))=='y'&&flag) monogram+= 'y';
            }
            if (nev.charAt(i)=='.')
            {
                countainsDot = true;
                monogram = " "+monogram;
                for(int j = i; j>0;j--)
                {
                    monogram = nev.charAt(j)+monogram;
                }
                monogram = nev.charAt(0)+monogram;
            }

            if(nev.charAt(i)=='-'){
                monogram = monogram + '-'+Character.toLowerCase( nev.charAt(i+1));
            }
        }

        if(!countainsDot ){
            if(Character.toLowerCase(nev.charAt(1))=='y' && flag) monogram= 'y'+monogram;
            monogram =Character.toLowerCase( nev.charAt(0))+monogram;

        }

        return monogram;
    }


}
