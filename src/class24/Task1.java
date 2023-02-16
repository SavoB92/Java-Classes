package class24;
/*  //Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
   //Define common behavior within and some fields in parent class and override some of the methods in child classes
  //Define some methods specific to child classes
 //Create objects of child classes and store them into array. Loop through each object and execute available methods.  */
public class Task1 {
    public static void main(String[] args) {
    Computer [] computers = {new Apple(), new HP()};

    for (Computer c : computers) {
        c.playVideo();
        c.browseInternet();

        if (c instanceof Apple) { // We are checking if the variable C contains the object of an Apple class.
            Apple apple = (Apple) c; // Converts variable C back to an apple object.
        }
      }
   }
}
class Computer {
    int RAM;
    int storage;
    String OS;
    void playVideo () {
        System.out.println("Video is playing!");
    }
    void browseInternet () {
        System.out.println("Browse the internet!");
    }
}
// *********************************************************************************************************************
class Apple extends Computer {
    @Override
    void playVideo() {
        System.out.println("Play the video on the Quick Time player!");
    }
    @Override
    void browseInternet() {
        System.out.println("Browsing the internet!");
    }
    void editVideos () {
        System.out.println("Editing videos on iMovies!");
    }
    void installApp () {
        System.out.println("Install the apps from the App store!");
    }
}
// *********************************************************************************************************************
class HP extends Computer {
    @Override
    void browseInternet() {
        System.out.println("Browsing the internet using Chrome!");
    }
    @Override
    void playVideo() {
        System.out.println("Playing the videos using Windows Media Player!");
    }
    void installApps () {
        System.out.println("You can install any app on the Microsoft store!");
    }
}

// *********************************************************************************************************************
