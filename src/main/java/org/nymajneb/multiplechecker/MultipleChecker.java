package org.nymajneb.multiplechecker;

import java.time.LocalDateTime;

public abstract class MultipleChecker {
    abstract int getInteger();

    abstract String getIntegerAsString();

    boolean check(int i){
        return i % getInteger() == 0;
    }

    void logThisIsAMultipleOfMe(int i, long chrono){
        System.out.println(String.valueOf(i) + " is a multiple of " + getIntegerAsString() + " - started since " + chrono + " ms");
    }
}
