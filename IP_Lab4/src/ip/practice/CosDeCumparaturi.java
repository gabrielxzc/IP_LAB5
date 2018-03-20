package ip.practice;

import java.util.List;

public class CosDeCumparaturi {



    private List<Produse> produse;
    private static final int NUMAR_MAXIM_PRODUSE = 15; //nr maxim de produse admise intr un cos

    //Metoda pentru costul total al Cosului de Cumparaturi
    public double getTotalPrice()
    {
        double sum = 0;
        for (Produse p : produse)
        {
            sum += p.getPret();
        }

        return sum;
    }

    public void addProdus(Produse prod)
    {
        //TODO: Verifica produs valid

        produse.add(prod);
    }

    public List<Produse> getProduse() {
        return produse;
    }

    public void setProduse(List<Produse> produse) {
        this.produse = produse;
    }
}
