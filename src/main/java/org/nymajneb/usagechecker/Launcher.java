package org.nymajneb.usagechecker;

import java.util.concurrent.TimeUnit;

public class Launcher {
    public static void main(String[] args) throws Exception {
        CoverageExtractor extractor = new CoverageExtractor();
        while(true){
            extractor.extract();
            TimeUnit.MILLISECONDS.sleep(500);
        }
    }
}
