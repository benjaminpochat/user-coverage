package org.nymajneb.multiplechecker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public class Launcher {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        int i = 1;
        Collection<MultipleChecker> multipleCheckers = new ArrayList<MultipleChecker>();
        multipleCheckers.add(new MultipleOf2Checker());
        multipleCheckers.add(new MultipleOf3Checker());
        multipleCheckers.add(new MultipleOf5Checker());
        multipleCheckers.add(new MultipleOf7Checker());
        multipleCheckers.add(new MultipleOf11Checker());
        multipleCheckers.add(new MultipleOf13Checker());
        multipleCheckers.add(new MultipleOf17Checker());
        multipleCheckers.add(new MultipleOf19Checker());
        multipleCheckers.add(new MultipleOf23Checker());
        multipleCheckers.add(new MultipleOf29Checker());
        multipleCheckers.add(new MultipleOf31Checker());
        multipleCheckers.add(new MultipleOf37Checker());
        multipleCheckers.add(new MultipleOf9999971Checker());
        multipleCheckers.add(new MultipleOf9999973Checker());
        multipleCheckers.add(new MultipleOf9999991Checker());
        while(true){
            for(MultipleChecker checker : multipleCheckers) {
                if(checker.check(i)){
                    checker.logThisIsAMultipleOfMe(i, System.currentTimeMillis() - start);
                    TimeUnit.SECONDS.sleep(1);
                }
            }
            i++;
        }
    }
}
