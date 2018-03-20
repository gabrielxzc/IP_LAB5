// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CosDeCumparaturi.java

package ip.practice;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package ip.practice:
//            Produse

public class CosDeCumparaturi
{

    public CosDeCumparaturi()
    {
    }

    public double getTotalPrice()
    {
        double sum = 0.0D;
        for(Iterator iterator = produse.iterator(); iterator.hasNext();)
        {
            Produse p = (Produse)iterator.next();
            sum += p.getPret();
        }

        return sum;
    }

    public void addProdus(Produse prod)
    {
        produse.add(prod);
    }

    public List getProduse()
    {
        return produse;
    }

    public void setProduse(List produse)
    {
        this.produse = produse;
    }

    private List produse;
    private static final int NUMAR_MAXIM_PRODUSE = 15;
}
