// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Event.java


public class Event
{

    public Event()
    {
    }

    public String getType()
    {
        return null;
    }

    public long getTime()
    {
        return 0L;
    }

    public String getAction()
    {
        return null;
    }

    public String getResultedCode()
    {
        return null;
    }

    public String eventType;
    public long time;
    public int resultedCode;
    public String action;
    public EventHandler myEventHandler;
}
