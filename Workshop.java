import java.util.ArrayList;

public class Workshop{
    private int nummer;
    private String bezeichnung;
    private String datum;
    private ArrayList<Teilnehmer>teilnehmerListe;

    public Workshop(int nummer, String bezeichnung, String datum){
        this.nummer = nummer;
        this.bezeichnung = bezeichnung;
        this.datum = datum;
        teilnehmerListe = new  ArrayList<Teilnehmer>();
    }

    public void addTeilnehmer(Teilnehmer teilnehmer){
        teilnehmerListe.add(teilnehmer);
    }

    public String toString(){
        return "Workshop " + nummer + " findet am " + datum + " statt.\nInfo: " + bezeichnung + "\nTeilnehmerListe: " + teilnehmerListe;
    }
}