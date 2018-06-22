package chap14.composite._03.ex01;

import java.util.ArrayList;
import java.util.List;

public abstract class FileSystemObject {

    String name;
    int depth;

    public FileSystemObject(String name) {
        this.name = name;
    }

    public FileSystemObject(String name, int depth) {
        this.name = name;
        this.depth = depth;
    }

    private FileSystemObject() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    abstract int getSize();
    abstract void print();
}