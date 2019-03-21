package persistens;

public class Kunde {

    private int kundeId;
    private String navn;

    public Kunde() {
    }

    public Kunde(int kundeId, String navn) {
        this.kundeId = kundeId;
        this.navn = navn;
    }

    public int getKundeId() {
        return kundeId;
    }

    public void setKundeId(int kundeId) {
        this.kundeId = kundeId;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}
