package day13;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("Petr");
        User user2 = new User("Ivan");
        User user3 = new User("Mark");

        user1.sendMessage(user2, "Hi");
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "Hi");
        user2.sendMessage(user1, "Okey");
        user2.sendMessage(user1, "And you?");

        user3.sendMessage(user1, "Where are you?");
        user3.sendMessage(user1, "I have tickets to the cinema");
        user3.sendMessage(user1, "Let's go together?");

        user1.sendMessage(user3, "I am free");
        user1.sendMessage(user3, "Let's go");
        user1.sendMessage(user3, "When?");

        user3.sendMessage(user1, "Today, at 5PM");

        MessageDatabase.showDialog(user1, user3);

    }
}
