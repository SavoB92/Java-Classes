package class24;
public abstract class Phone {
   abstract void displayPictures ();
   abstract void unlockPhone ();
   abstract void sendText ();
}
// *********************************************************************************************************************
class Iphone extends Phone {
    @Override
    void displayPictures() {
        System.out.println("Display IOS details!");
    }
    @Override
    void unlockPhone() {
        System.out.println("Unlock IOS device!");
    }
    @Override
    void sendText() {
        System.out.println("Send iMessage!");
    }
}
// *********************************************************************************************************************
class Samsung extends Phone {
    @Override
    void displayPictures() {
        System.out.println("Display Android details!");
    }
    @Override
    void unlockPhone() {
        System.out.println("Unlock Android device!");
    }
    @Override
    void sendText() {
        System.out.println("Send regular text message!");
    }
}
class GooglePixel extends Phone {
    @Override
    void displayPictures() {
        System.out.println("Display GooglePixel details!");
    }
    @Override
    void unlockPhone() {
        System.out.println("Unlock GooglePixel device!");
    }
    @Override
    void sendText() {
        System.out.println("Send Google message!");
    }
}
// *********************************************************************************************************************