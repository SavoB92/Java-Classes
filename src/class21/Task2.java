package class21;
public class Task2 {
    // In this particular case, when we add STATIC we do not have to create an object after PUBLIC STATIC VOID MAIN METHOD.
    // We just need to call the values.
    static void print (int str) {
        System.out.println(str);
    }
    static void print (int str, int str2) {
        System.out.println(str+str2);
    }
    static void print (int str, double str2) {
        System.out.println(str*str2);
    }
    public static void main(String[] args) {
        print(10);
        print(10, 10);
        print(10,10.5);


    }
}
/*Create 1 class with a private method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.*/