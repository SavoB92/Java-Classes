package class12;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in) ;
        System.out.println("Please Enter Your Username: ");
        String username = scan.nextLine() ;
        System.out.println("Please Enter Your Password: ") ;
        String password = scan.nextLine() ;
        System.out.println("Please Confirm Your Password: ") ;
        String confirmPassword = scan.nextLine() ;

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username & Password Should Not Be Empty!");
        } else if (password.length()<8) {
            System.out.println("Password Should Not Be Less Than 8 Characters!");
        } else if (username.contains(password)) {
            System.out.println("Password Can Not Contain Username!");
        } else if (!password.equals(confirmPassword)) {
            System.out.println("Passwords Do Not Match!");
        } else {
            System.out.println("You Have Successfully Created Username And Password!");
        }

    }
}
/*Store username, password and confirm password from a user and check
following requirements:

Username and Password cannot be  empty, if so→ message=”Username and Password
cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been
created”*/
/*
        Scanner scan = new Scanner (System.in) ;
        // Get username and password from the user.
        System.out.println("Enter username: ") ;
        String username = scan.nextLine() ;
        System.out.println("Enter password: ") ;
        String password = scan.nextLine() ;
        System.out.println("Confirm password: ") ;
        String confirmPassword = scan.nextLine() ;

        // Check if username and password are not empty.
        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username and password can not be empty!") ;
        }

        // Check if password is at least 8 characters.
        else if (password.length()<8) {
            System.out.println("Password can not be less than 8 characters!") ;
        }

        // Check if password contains username.
        else if (password.contains(username)) {
            System.out.println("Password can not contain username!") ;
        }

        // Check if password matches confirm password.
        else if (!password.equals(confirmPassword)) {
            System.out.println("Passwords have to match!");
        }

        // Check if all requirement meet.
        else {
            System.out.println("Your username and password have been created!");
        }
*/

