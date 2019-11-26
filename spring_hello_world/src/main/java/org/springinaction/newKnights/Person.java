package org.springinaction.newKnights;

import org.springinaction.oldKnights.DoSth;
import org.springinaction.oldKnights.LogService;

public class Person {
    private DoSth doSth;

    public Person(DoSth doSth) {
        this.doSth = doSth;
    }

    public void triggleDoSthImp() {
        doSth.doSomething();
    }
}
