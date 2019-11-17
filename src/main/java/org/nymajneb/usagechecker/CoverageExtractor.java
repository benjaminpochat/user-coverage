package org.nymajneb.usagechecker;

import org.jacoco.core.tools.ExecDumpClient;
import org.jacoco.core.tools.ExecFileLoader;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CoverageExtractor {
    public void extract() throws Exception {
        String extractFolder = "/home/benjamin/Bureau/jacoco-dump/";
        String fileName = "jacoco-"+ LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME) +".exec";
        ExecDumpClient jacocoDumpClient = new ExecDumpClient();
        jacocoDumpClient.setReset(true);
        ExecFileLoader execFileLoader = jacocoDumpClient.dump("localhost", 6300);
        File execFile = new File(extractFolder + fileName);
        execFileLoader.save(execFile, true);
    }
}
