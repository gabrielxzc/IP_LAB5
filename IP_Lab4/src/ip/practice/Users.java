package ip.practice;

public class Users {


    private String nume;
    private Cont cont;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {

        //TODO: Verifica ca numele sa fie valid, numar caractere, simboluri interzise etc

        if (nume.length() <= 2) {
            System.err.println("Invalid name, trebuie sa aiba cel putin 2 caractere");

        } else
            this.nume = nume;
    }

    public Cont getCont() {
        return cont;
    }

    public void setCont(Cont cont) {
        //TODO: Verifica contul sa fie valid
        this.cont = cont;
    }
}
