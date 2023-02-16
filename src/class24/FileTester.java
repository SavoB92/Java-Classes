package class24;
public class FileTester {
    public static void main(String[] args) {
        File [] fileName = {new JavaFile (1024), new PdfFile(25), new PdfFile(50)};

        for (int i = 0; i < fileName.length; i++) {
            File f = fileName[i];
            f.open();
            f.edit();
            f.close();
        }

/*        for (File newFileName : fileName) {
            newFileName.open();
            newFileName.edit();
            newFileName.close();
            System.out.println();
        }*/

    }
}
