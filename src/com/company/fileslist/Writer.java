package com.company.fileslist;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Writer implements Runnable {

    private HashMap<Integer, File> files;

    public Writer  (HashMap<Integer,File> files){
        this.files = files;
    }

    @Override
    public void run() {
        try {
            FileWriter addLastLine = null;
            for (int i = 0; i < files.size(); i++) {
                for (int j = 0; j < 10; j++) {
                    addLastLine = new FileWriter(files.get(i), true);
                    addLastLine.write(Thread.currentThread().getName() + ", iter=" + j + ", file in dir: " + (i+1) + "\r\n");
                    addLastLine.flush();
                }
            }
            addLastLine.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException ex){
//            System.out.println("The Thread are deaded");
        }


    }
}
