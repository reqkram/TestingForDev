package com.test;

import java.io.File;
import java.io.IOException;

public class Main {
    final static String EP_FILE = "ep_file";
    public static void main(String[] args) throws IOException {
        try{
            String suffix = ".json";
            File file = File.createTempFile(EP_FILE,suffix);
            System.err.println(file.getAbsolutePath());
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
