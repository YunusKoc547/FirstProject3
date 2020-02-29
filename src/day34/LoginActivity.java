package day34;

public class LoginActivity {

    public static void main(String[] args) {
        login1("user","abc123");
        login2("user","abc123");
    }

    public static void login1(String username, String password) {
        if (username.equals("user") && password.equals("abc123")) {
            System.out.println("login successful");
        }else if (!username.equals("user") && password.equals("abc123")){
            System.out.println("login failed, username incorrect");
        }else if (username.equals("user") && !password.equals("abc123")) {
            System.out.println("login failed, password incorrect");
        }else {
            System.out.println("login failed, password and username incorrect");
        }
    }

    public static boolean login2 (String username, String password) {
        boolean result = false;
        if (username.equals("user") && password.equals("abc123")) {
            result = true;
        }
        System.out.println(result);
        return result;
    }
}
