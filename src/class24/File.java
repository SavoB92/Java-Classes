package class24;
public abstract class File {
    int size;
    File (int size) {
        this.size = size;
    }
    abstract void open ();
    void edit () {
        System.out.println("Edit!");
    }
    void close () {
        System.out.println("Close!");
    }
}
// *********************************************************************************************************************
class JavaFile extends File {
    JavaFile (int size) {
        super(size);
    }
    @Override
    void open() {
        System.out.println("To open .java file we need notepad++!");
    }
    @Override
    void edit() {
        System.out.println("Edit java file!");
    }
    @Override
    void close() {
        System.out.println("Close java file!");
    }
}
// *********************************************************************************************************************
class WordFile extends File {
    WordFile (int size) {
        super(size);
    }
    @Override
    void open() {
        System.out.println("To open .word file we need...!");
    }
    @Override
    void edit() {
        System.out.println("Edit word file!");
    }
    @Override
    void close() {
        System.out.println("Close word file!");
    }
}
// *********************************************************************************************************************
class PdfFile extends File {
    PdfFile (int size) {
        super(size);
    }
    @Override
    void open() {
        System.out.println("To open .pdf file we need...!");
    }
    @Override
    void edit() {
        System.out.println("Edit pdf file!");
    }

    @Override
    void close() {
        System.out.println("Close pdf file!");
    }
}
// *********************************************************************************************************************