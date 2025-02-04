package lesson4;

public class Main {
    public static void main(String[] args) {
        doLogin("John", "1245");
    }

    public static void doLogin(String name, String password)
    {
        if(checkPassword(password))
        {
            sayHelloToUser(name);
        }else {
            informUserOfInvalidLogin();
        }
    }


    public static boolean checkPassword(String password)
    {
        return password.equals("12345");
    }


    public static void sayHelloToUser(String name)
    {
        System.out.println("Hello " +  name);
    }

    public static void informUserOfInvalidLogin( )
    {
        System.out.println("Invalid Login");
    }

}
