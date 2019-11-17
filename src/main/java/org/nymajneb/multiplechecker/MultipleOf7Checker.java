package org.nymajneb.multiplechecker;

public class MultipleOf7Checker extends MultipleChecker {
    @Override
    int getInteger() {
        return 7;
    }

    @Override
    String getIntegerAsString() {
        return "seven";
    }
}
