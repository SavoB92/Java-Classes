package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        Below line is reserving the box in the computers memory we are calling it box1 if we need the information that we are storing inside this box
        we can simply say to the computer give us the contents of the box1.
        int => what type of data we want to store
        box1 => is the name of the box
        = sign will take whatever we write after it and will store it inside the box1
        10 => is what we are storing inside the box
         */
        int box1 = 10;
        // if we are printing something from a box we do not need ""
        System.out.println(box1); //bring the contents of box1 and print them on the console
        //
        byte box2=127; //range for byte is from -128 to 127
        byte box3=-128;
        short box4=32767; //the maximum limit for short is 32767
        int biggerBox=1234564534; // int is for a lot bigger numbers. any we want. most common type of the box.
        long maxBox=151231662315l; //
        short myBox=10000;
        System.out.println(myBox);
    }
}
