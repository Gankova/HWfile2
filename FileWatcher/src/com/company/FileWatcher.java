package com.company;

import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FileWatcher {
    public String adress;
    public long interval;
    public File file;
    public Runnable r;

    public FileWatcher(String dir, long pollingInterval) {
        this.adress = dir;
        this.interval = pollingInterval;
    }

    HashMap<String, Long> filearray = new HashMap();
    HashMap filesarray2 = new HashMap();

    public void watch() throws InterruptedException {
        Thread thread = new Thread();

        File n = new File(adress);
        for (File file : n.listFiles()) {
            if (file.isFile()) {
                filearray.put(file.getName(),file.length());
            }
        }
        thread.start();
        thread.wait(interval);
        for (File file : n.listFiles()) {
            if (file.isFile()) {
                filesarray2.put(file.getName(),file.length());
            }
        }
        filearray = filesarray2;
        thread.start();


        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        }
        public void scet() throws InterruptedException {
            if (filesarray2.size()== filearray.size()) {


                for (int i = 0; i < filesarray2.size(); i++) {
                    String name2 = file.getName();
                    for (int k = 0; k < filearray.size(); i++) {
                        String name = file.getName();
                        if (name2.equals(name)) {
                            i++;
                        }
                        System.out.println("Папка изменена");
                        break
                    }

                    if (filesarray2.g) {

                    }
                }


                }
            }

        }




    }











