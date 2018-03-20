// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Cont.java

package ip.practice;


public class Cont
{

    public Cont()
    {
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        if(email.length() > 5)
            this.email = email;
    }

    public String getParola()
    {
        return parola;
    }

    public void setParola(String parola)
    {
        this.parola = parola;
    }

    public int getID()
    {
        return ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    private String email;
    private String parola;
    private int ID;
}
