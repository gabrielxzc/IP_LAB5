// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Aplicatie.java

package ip.practice;

import java.util.ArrayList;

// Referenced classes of package ip.practice:
//            Database

public class Aplicatie
{

    private Aplicatie()
    {
        bazaDeDate = Database.getInstance();
        clients = new ArrayList();
    }

    public static Aplicatie getInstance()
    {
        if(instance == null)
            instance = new Aplicatie();
        return instance;
    }

    private static Aplicatie instance = null;
    private Database bazaDeDate;
    private ArrayList clients;

}
