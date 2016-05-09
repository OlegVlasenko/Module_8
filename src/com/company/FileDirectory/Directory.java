package com.company.FileDirectory;

import java.util.ArrayList;
import java.util.List;

class Directory {
    private ArrayList<File> files = new ArrayList<>();

    public void addFile(File paramFile) {
        this.files.add(paramFile);
    }

    public void viewDir() {
        for (File file : this.files) {
            System.out.println(file.getName() + "." + file.getExtension());
        }
    }

    public List<File> getDir() {
        return this.files;
    }

    public Directory(ArrayList<File> files) {
        this.files = files;
    }
}