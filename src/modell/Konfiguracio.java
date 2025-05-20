package modell;

public class Konfiguracio {
    //ADATTAGOK
    public static final String[] VALASZTHATO_SZAKOK = {"Szoftverfejlesztő", "Rendszergazda", "Szoftverfejlesztő és tesztelő"};
    
    private String nev;
    private int szakIndex;
    private boolean hirlevel;
    
    //GENERÁLHATÓAK: ALT + INSERT
    //TAGFV.

    public Konfiguracio(String nev, int szakIndex, boolean hirlevel) {
        this.nev = nev;
        this.szakIndex = szakIndex;
        this.hirlevel = hirlevel;
    }

    public String getNev() {
        return nev;
    }

    public int getSzakIndex() {
        return szakIndex;
    }

    public boolean isHirlevel() {
        return hirlevel;
    }

    //@Override //öröklés az Obj osztályból - felülírjuk a metódust - az obj szöveges reprezentációja
    public String toString() {
        return "Konfiguracio{" + "nev=" + nev + ", szakIndex=" + szakIndex + ", hirlevel=" + hirlevel + '}';
    }
    
    
}
