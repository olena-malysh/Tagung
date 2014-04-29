import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
		Rahmenprogramm rahmenprogramm = new Rahmenprogramm("Rahmenprogrammbezeichnung", "29. April 2014", "14.30", "Finkenau 38");
		rahmenprogramm.addTeilnehmer(new Teilnehmer("Maria Korsun", "maria.korsun@tagung.de", "Student"));
		rahmenprogramm.addTeilnehmer(new Teilnehmer("Benjamin Kahle", "benjamin.kahle@tagung.de", "Mitglied"));
		System.out.println(rahmenprogramm);
		
		Referent referent = new Referent("Peter Schmolke", "peter.schmolke@tagung.de", "Formacja");
		referent.addWorkshop(new Workshop(3004141, "Beschreibung von dem Workshop Nr.1", "5. Mai 2014"));
		referent.addWorkshop(new Workshop(3004142, "Beschreibung von dem Workshop Nr.2", "6. Mai 2014"));
		System.out.println(referent);
    }
}