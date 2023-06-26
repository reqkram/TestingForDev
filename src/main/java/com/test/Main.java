package com.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    final static String EP_FILE = "ep_file";
    public static void main(String[] args) throws IOException {
        File file = Files.createTempFile(EP_FILE, "test" + ".pdf").toFile();
        System.out.println(file.getAbsolutePath());
    }
}
