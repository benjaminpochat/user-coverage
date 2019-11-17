package org.nymajneb.multiplechecker;

public class MultipleOf23Checker extends MultipleChecker {
    @Override
    int getInteger() {
        return 23;
    }

    @Override
    String getIntegerAsString() {
        return "twenty-three";
    }
}
