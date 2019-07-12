package com.stackroute.domain;

public class Actor {

     String actorname;
    String actorgender;
    int actorage;

    public Actor(String actorname, String actorgender, int actorage) {
        this.actorname = actorname;
        this.actorgender = actorgender;
        this.actorage = actorage;
    }

    public void displayActorInformation()
    {
        System.out.println("actorname:"+actorname);
        System.out.println("actorgender:"+actorgender);
        System.out.println("actorage:"+actorage);
    }


}
