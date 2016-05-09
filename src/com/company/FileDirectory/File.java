package com.company.FileDirectory;

abstract public class File {
    private final String name;

    private final String ext;

    File(String nameParam, String paramExt) {
        this.name = nameParam;
        this.ext = paramExt;
    }

    public String toString() {
        return this.name + "." + this.ext;
    }

    public String getName() {
        return this.name;
    }

    public String getExtension() {
        return this.ext;
    }

}