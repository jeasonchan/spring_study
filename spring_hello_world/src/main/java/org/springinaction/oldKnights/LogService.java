package org.springinaction.oldKnights;

import java.io.PrintStream;

public class LogService {
    private PrintStream stream;

    public LogService(PrintStream stream) {
        this.stream = stream;
    }

    public void logBeforeOperatoin() {
        stream.println("log before operation!");
    }

    public void logAfterOperatoin() {
        stream.println("log after operation!");
    }


}
