public class Teilnehmer{
    private String name;
    private String email;
    private String status;
    private boolean istAngemeldet;

    public Teilnehmer(String name, String email, String status){
        this.name = name;
        this.email = email;
        this.status = status;
    }

    public String toString(){
        return "Name: " + name + "; E-Mail: " + email + "; Status: " + status + "\n"; 
    }

    public boolean anmelden(){
        if(istAngemeldet==false){
            istAngemeldet = true;
        }
        return true;
    }

}