package ip.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class CosDeCumparaturi extends Observable{

    private boolean isTransactionComplete;

    ArrayList<Observer> observerArrayList = new ArrayList<Observer>();

    CosObserver eventSource = new CosObserver();

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

    public void addObs(){

        observerArrayList.add(new Observer() {
            public void update(Observable obj, Object arg) {
                System.out.println("Received response: " + arg);
            }
        });

//        new Thread(eventSource).start();

        isTransactionComplete = true;
    }

    void updateObservers(){
        for (Observer o : observerArrayList)
            o.update(eventSource, this);
    }
}
