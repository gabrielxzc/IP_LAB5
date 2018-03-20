package ip.practice;

public class Cont {

    private String email;
    private String parola;
    private int ID;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if (email.length() <= 5)
        {
            //System.err.println("Invalid name, trebuie sa aiba cel putin 2 caractere");

            //TODO: verifica daca e email valid x@a.b

        }
        else
            this.email = email;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
