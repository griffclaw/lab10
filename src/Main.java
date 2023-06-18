import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        User user = new User("admin", "1234", 18);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        System.out.println("Доступ предоставлен");
    }

}