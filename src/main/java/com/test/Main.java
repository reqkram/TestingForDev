package com.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class Main {
    final static String EP_FILE = "ep_file";
    public static void main(String[] args) throws IOException {
        try{
            String receiptNo = "test111";
            String suffix = ".json";
            File file = File.createTempFile(receiptNo,suffix);
            System.err.println(file.getAbsolutePath());
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
