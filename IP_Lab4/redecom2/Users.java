// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Users.java

package ip.practice;

import java.io.PrintStream;

// Referenced classes of package ip.practice:
//            Cont

public class Users
{

    public Users()
    {
    }

    public String getNume()
    {
        return nume;
    }

    public void setNume(String nume)
    {
        if(nume.length() <= 2)
            System.err.println("Invalid name, trebuie sa aiba cel putin 2 caractere");
        else
            this.nume = nume;
    }

    public Cont getCont()
    {
        return cont;
    }

    public void setCont(Cont cont)
    {
        this.cont = cont;
    }

    private String nume;
    private Cont cont;
}
