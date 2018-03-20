// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Database.java

package ip.practice;

import java.util.ArrayList;

public class Database
{

    private Database()
    {
    }

    public static Database getInstance()
    {
        if(instance == null)
            instance = new Database();
        return instance;
    }

    private static Database instance = null;
    private ArrayList utilizatori;
    private ArrayList produse;

}
