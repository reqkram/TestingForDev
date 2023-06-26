package com.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    final static String EP_FILE = "ep_file";
    public static void main(String[] args) throws IOException {
        try{
            String receiptNo = "test";
            String suffix = ".pdf";
            File fileFolder = Files.createTempDirectory(EP_FILE).toFile();
            boolean isReadable = fileFolder.setReadable(true, true);
            boolean isWritable =fileFolder.setWritable(true, true);
            boolean isExecutable = fileFolder.setExecutable(true, true);
            System.err.println(fileFolder.getAbsolutePath());
            System.err.println(isReadable);
            System.err.println(isWritable);
            System.err.println(isExecutable);
            File file =  new File(fileFolder, receiptNo + suffix);
            System.err.println(file.getAbsolutePath());

        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
