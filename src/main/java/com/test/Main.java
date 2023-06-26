package com.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    final static String EP_FILE = "ep_file";
    public static void main(String[] args) throws IOException {
        File file = null;
        String receiptNo = "test";
        file = Files.createTempFile(EP_FILE, receiptNo + ".pdf").toFile();
        boolean isReadable = file.setReadable(true, true);
        boolean isWritable =file.setWritable(true, true);
        boolean isExecutable = file.setExecutable(true, true);
        System.err.println(file.getAbsolutePath());
        System.err.println(isReadable);
        System.err.println(isWritable);
        System.err.println(isExecutable);

    }
}
