package chap14.composite._03.ex01;

public class File extends FileSystemObject {
    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        for( int i = 0; i < depth; ++i ) {
            System.out.print("\t");
        }
        System.out.println("[File] " + name + ", Size: " + size);
    }
}
