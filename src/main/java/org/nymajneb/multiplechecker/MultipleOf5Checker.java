package org.nymajneb.multiplechecker;

public class MultipleOf5Checker extends MultipleChecker {
    @Override
    int getInteger() {
        return 5;
    }

    @Override
    String getIntegerAsString() {
        return "five";
    }
}
