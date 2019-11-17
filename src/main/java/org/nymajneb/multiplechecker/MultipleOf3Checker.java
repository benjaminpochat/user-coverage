package org.nymajneb.multiplechecker;

public class MultipleOf3Checker extends MultipleChecker {
    @Override
    int getInteger() {
        return 3;
    }

    @Override
    String getIntegerAsString() {
        return "three";
    }
}
