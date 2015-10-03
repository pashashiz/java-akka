package com.ps.tutorial;

import akka.actor.UntypedActor;


public class SqrValueActor extends UntypedActor {
    @Override
    public void onReceive(Object message) throws Exception {
        if (message instanceof Integer) {
            int value = (Integer) message;
            sender().tell(value * value, self());
        }
    }
}
