package com.company;

import com.company.console.UserInputPath;
import com.company.console.IUIPath;
import com.company.fileslist.FilesOnDirectory;
import com.company.fileslist.IFilesOnDirectory;
import com.company.fileslist.Writer;

public class Main {

    public static void main(String[] args)  {
        while (true) {

            IUIPath userInput = new UserInputPath();
            IFilesOnDirectory list = new FilesOnDirectory(userInput.getPath());
            Writer writer = new Writer(list.getHashMap());
            Thread t1 = new Thread(writer);
            Thread t2 = new Thread(writer);
            t1.start();
            t2.start();
            if (!list.getHashMap().isEmpty()) {
                System.out.println("Text had been added to file.");
                break;
            }
            System.out.println("Oops, may be you wrote incorrect path.\nTry again");
        }
    }
}