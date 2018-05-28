package com.company.fileslist;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;

public class FilesOnDirectory implements IFilesOnDirectory {

//    private String mask= ".txt";
    private String path;
    private HashMap<Integer, File> hashMap;
    private final FilenameFilter mask = new FileMask(".txt");

    public FilesOnDirectory(String path) {
        this.path = path;
        hashMap = new HashMap<>();
        addFilestoHashMap();
    }

    private void addFilestoHashMap() {
        File folder = new File(path);
        if (folder.isDirectory()) {
            int i = 0;
            for (File file : folder.listFiles(mask)){
                if (file.isFile()) {
                    hashMap.put(i, file);
                    i++;
                }
            }
        }
    }

    @Override
    public HashMap<Integer, File> getHashMap() {
        return hashMap;
    }
}
//dz: сделать клиент серверное приложение, которое должно по сети принимать различные команды и сервер должен их выполнять
// команды: 1)добавить папку(сервер запущен и смотрит на директорию), 2) удалить папку, 3) создать файл(ткст), 4) записать текст в него, 5) удалить файл, 6) показать список всех файлов


