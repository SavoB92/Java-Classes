package class24;
public class PhoneTester {
    public static void main(String[] args) {

        Phone [] phoneTester = {new Iphone(), new Samsung(), new GooglePixel()};

        for (Phone newName : phoneTester) {
            newName.displayPictures();
            newName.unlockPhone();
            newName.sendText();
            System.out.println();
        }
    }
}
