package chap14.composite._03.ex01;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemObject {
    private List<FileSystemObject> entries;

    private Directory() {
        super("");
    }

    public Directory(String name) {
        super(name);
        entries = new ArrayList<FileSystemObject>();
    }

    public void addEntry(FileSystemObject entry) {
        entry.setDepth(depth+1);
        entries.add(entry);
    }

    public void removeEntry(FileSystemObject entry) {
        entries.remove(entry);
    }

    public int getSize() {
        int size = 0;
        for( FileSystemObject obj : entries ) {
            size += obj.getSize();
        }

        return size;
    }

    public void print() {
        for (int i = 0; i < depth; i++)
            System.out.print("\t");

        System.out.println("[Directory] " + name + ", Size: " + getSize());

        for( FileSystemObject obj : entries ) {
            obj.print();
        }
    }

}