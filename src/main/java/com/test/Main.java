package com.test;

import java.io.File;
import java.io.IOException;

public class Main {
    final static String EP_FILE = "ep_file";
    final static String TEMP_DIRECTORY = "java.io.tmpdir";
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
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
