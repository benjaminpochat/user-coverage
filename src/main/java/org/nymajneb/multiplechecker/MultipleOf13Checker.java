package org.nymajneb.multiplechecker;

public class MultipleOf13Checker extends MultipleChecker {
    @Override
    int getInteger() {
        return 13;
    }

    @Override
    String getIntegerAsString() {
        return "thirteen";
    }
}
