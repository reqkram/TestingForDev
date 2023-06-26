package com.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    final static String EP_FILE = "ep_file";
    public static void main(String[] args) throws IOException {
        try{
            String receiptNo = "test111";
            File file = File.createTempFile(EP_FILE + receiptNo ,".pdf");
            boolean isReadable = file.setReadable(true, true);
            boolean isWritable =file.setWritable(true, true);
            boolean isExecutable = file.setExecutable(true, true);
            System.err.println(file.getAbsolutePath());
            System.err.println(isReadable);
            System.err.println(isWritable);
            System.err.println(isExecutable);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
