import java.util.ArrayList;

public class Rahmenprogramm{
    private String bezeichnung;
    private String datum;
    private String uhrzeit;
    private String ort;
    private ArrayList<Teilnehmer>teilnehmerListe;

    public Rahmenprogramm(String bezeichnung, String datum, String uhrzeit, String ort){
        this.bezeichnung = bezeichnung;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.ort = ort;
        teilnehmerListe = new  ArrayList<Teilnehmer>();
    }

    public void addTeilnehmer(Teilnehmer teilnehmer){
        teilnehmerListe.add(teilnehmer);
    }

    public String toString(){
        return "Rahmenprogramm findet am " + datum + " um " + uhrzeit + " in " + ort + " statt.\nInfo: " + bezeichnung + "\nTeilnehmerListe: " + teilnehmerListe;
    }
}