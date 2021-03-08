package day13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MessageDatabase {

    private static final List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        Message message = new Message(u1, u2, text);
        messages.add(message);
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        messages.stream()
                .filter(message -> (message.getSender() == u1 && message.getReciver() == u2) || (message.getSender() == u2 && message.getReciver() == u1))
                .collect(Collectors.toList())
                .forEach(message -> System.out.println(message.getSender() + ": " + message.getText()));
    }

}
