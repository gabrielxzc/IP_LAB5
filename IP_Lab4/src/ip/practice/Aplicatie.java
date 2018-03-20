package ip.practice;

import java.util.ArrayList;

public class Aplicatie {

    private static Aplicatie instance = null;
    private Aplicatie() {}

    public static Aplicatie getInstance() {
        if(instance == null) {
            instance = new Aplicatie();
        }
        return instance;
    }

    private Database bazaDeDate = Database.getInstance();
    private ArrayList<Client> clients = new ArrayList<Client>();

}
