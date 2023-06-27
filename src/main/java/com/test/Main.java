package com.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    static final String EP_FILE = "ep_file";
    static final String TEMP_DIRECTORY = "java.io.tmpdir";
    public static void main(String[] args) throws IOException {
        try{
            String receiptNo = "test";
            String suffix = ".pdf";
            File file =  new File(System.getProperty(TEMP_DIRECTORY), receiptNo + suffix);
            boolean isReadable = file.setReadable(true, true);
            boolean isWritable =file.setWritable(true, true);
            boolean isExecutable = file.setExecutable(true, true);
            boolean isCreated = file.createNewFile();
            System.err.println(isCreated);
            System.err.println(isReadable);
            System.err.println(isWritable);
            System.err.println(isExecutable);
            System.err.println(file.getAbsolutePath());
            System.err.println(file.exists());

            File tempFile = Files.createTempFile(EP_FILE, receiptNo + suffix).toFile();
            boolean isReadabletempFile = tempFile.setReadable(true, true);
            boolean isWritabletempFile =tempFile.setWritable(true, true);
            boolean isExecutabletempFile = tempFile.setExecutable(true, true);
            boolean isCreatedtempFile = file.createNewFile();
            System.err.println(isCreatedtempFile);
            System.err.println(isReadabletempFile);
            System.err.println(isWritabletempFile);
            System.err.println(isExecutabletempFile);
            System.err.println(tempFile.getAbsolutePath());
            System.err.println(tempFile.exists());
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
