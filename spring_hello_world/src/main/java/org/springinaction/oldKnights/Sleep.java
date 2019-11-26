package org.springinaction.oldKnights;

import java.io.PrintStream;

public class Sleep implements DoSth {
    private PrintStream stream;

    public Sleep(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void doSomething() {
        stream.println("Sleep!");
    }
}
