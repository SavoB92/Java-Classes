package class21;
public class Task3 {
    // This is the case without STATIC before VOID and therefore we do HAVE TO create an object of the class.
    void print (int str) {
        System.out.println(str);
    }
    void print (int str, int str2) {
        System.out.println(str+str2);
    }
    void print (int str, double str2) {
        System.out.println(str*str2);
    }
     public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.print(10);
        task3.print(10, 10);
        task3.print(10,10.5);
    }
}

