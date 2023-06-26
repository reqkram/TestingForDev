package com.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    final static String EP_FILE = "ep_file";
    public static void main(String[] args) throws IOException {
        File file = null;
        String receiptNo = "test";

       // file = Files.createTempFile(EP_FILE, receiptNo + ".pdf").toFile();

        Path tempPath = Files.createTempDirectory("ep_payment");
        File tempDir = tempPath.toFile();
        file = new File(tempDir, "ep_payment" + receiptNo + ".pdf");
        boolean isReadable = file.setReadable(true, true);
        boolean isWritable =file.setWritable(true, true);
        boolean isExecutable = file.setExecutable(true, true);
        System.err.println(file.getAbsolutePath());
        System.err.println(isReadable);
        System.err.println(isWritable);
        System.err.println(isExecutable);

    }
}
