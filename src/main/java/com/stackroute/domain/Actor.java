package com.stackroute.domain;

public class Actor {

    public Actor(String actorname, String actorgender, int actorage) {
        this.actorname = actorname;
        this.actorgender = actorgender;
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
