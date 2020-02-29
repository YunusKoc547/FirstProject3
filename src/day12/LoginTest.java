package day12;

public class LoginTest {

    public static void main(String[] args) {

        String userName = "user123";
        String password = "pass123";

        if (userName.equals("user123") && password.equals("pass123")){
            System.out.println("Login Successful");
        }
        else if (!userName.equals("user123") && password.equals("pass123")) {
            System.out.println("Username Incorrect");
        }
        else if (userName.equals("user123") && !password.equals("pass123")) {
            System.out.println("Password Incorrect");
        }
        else if (!userName.equals("user123") && !password.equals("pass123")) {
            System.out.println("Username and Password are Incorrect");
        }
    }
}
