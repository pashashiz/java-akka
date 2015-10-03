package com.ps.tutorial;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class Example {

    public static void main(String[] args) {
        ActorSystem system = ActorSystem.create("example");
        ActorRef printActor = system.actorOf(Props.create(PrintActor.class));
        ActorRef sqrValueActor = system.actorOf(Props.create(SqrValueActor.class));
        for (int i = 0; i < 5; i++)
            sqrValueActor.tell(i, printActor);
        system.shutdown();
    }
}
