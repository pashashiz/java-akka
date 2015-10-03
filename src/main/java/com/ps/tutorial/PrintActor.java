package com.ps.tutorial;

import akka.actor.UntypedActor;

public class PrintActor extends UntypedActor {
    @Override
    public void onReceive(Object message) throws Exception {
        System.out.println("Result: " + message);
    }
}
