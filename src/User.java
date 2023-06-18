public class User {
    public User[] users;

    public User(String login, String pass, int age) {

    }

    public static void User(String[] args){
        User[] users = new User[3];
        users[0] = new User("admin", "1234", 18);
        users[1] = new User("lox", "1234", 17);
    }
}
