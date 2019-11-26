package org.springinaction.oldKnights;

public class Person {
    private DoSth doSth;
    private LogService logService;

    public Person(DoSth doSth, LogService logService) {
        this.doSth = doSth;
        this.logService = logService;
    }

    public void triggleDoSthImp() {
        logService.logBeforeOperatoin();
        doSth.doSomething();
        logService.logAfterOperatoin();
    }
}
