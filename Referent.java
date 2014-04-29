import java.util.ArrayList;

public class Referent{
    private String name;
    private String email;
    private String firma;
	private boolean istAngemeldet;
    private ArrayList<Workshop>workshopListe;

    public Referent(String name, String email, String firma){
        this.name = name;
        this.email = email;
        this.firma = firma;
    }

    public void addWorkshop(Workshop workshop){
        workshopListe.add(workshop);
    }

    public boolean anmelden(){
        if(istAngemeldet==false){
            istAngemeldet = true;
        }
        return true;
    }

    public String toString(){
        return "Name: " + name + "; E-Mail: " + email + "; Firma: " + firma + "\nWorkshopangebot von " + name + ": " + workshopListe;
    }
}