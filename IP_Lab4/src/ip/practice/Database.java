package ip.practice;

import java.util.ArrayList;

public class Database {

    private static Database instance = null;
    private Database() {}

    public static Database getInstance() {
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }

    private ArrayList<Users> utilizatori;
    private ArrayList<Produse> produse;


}
