package com.company.FileDirectory;

import com.company.FileDirectory.File;

public class Txt extends File {

    private String name;

    public Txt(String nameParam ) {
        super(nameParam, "txt");
        this.name = nameParam;
    }
}