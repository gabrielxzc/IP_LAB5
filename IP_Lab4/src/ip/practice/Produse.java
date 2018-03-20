package ip.practice;

import java.awt.*;

public class Produse {

    private double pret;
    private Image imagine;
    private String nume;
    private int numarProdus;

    public double getPret() { return pret;}

    public void setPret(double pret) {
        //TODO: Verifica ca pretul sa nu fie negativ
        this.pret = pret;
    }
}
