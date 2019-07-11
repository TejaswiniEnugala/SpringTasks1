package com.stackroute.domain;

public class Actor {
    public void setActorname(String actorname) {
        this.actorname = actorname;
    }

    public void setActorgender(String actorgender) {
        this.actorgender = actorgender;
    }

    public void setActorage(int actorage) {
        this.actorage = actorage;
    }

    String actorname;
    String actorgender;
    int actorage;
    public void displayActorInformation()
    {
        System.out.println("actorname:"+actorname);
        System.out.println("actorgender:"+actorgender);
        System.out.println("actorage:"+actorage);
    }


}
