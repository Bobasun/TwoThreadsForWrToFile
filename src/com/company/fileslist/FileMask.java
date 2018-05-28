package com.company.fileslist;

import java.io.File;
import java.io.FilenameFilter;

public class FileMask implements FilenameFilter {

    String mask;



    public FileMask(String mask)
    {
        this.mask = mask;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.contains(mask);
    }
}
