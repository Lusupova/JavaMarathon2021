package day13;

import java.util.Date;

public class Message {

    private User sender;
    private User reciver;
    private String text;
    private Date date;

    public Message(User sender, User reciver, String text) {
        this.sender = sender;
        this.reciver = reciver;
        this.text = text;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public String getText() {
        return text;
    }

    public User getReciver() {
        return reciver;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "FROM: " + sender.getUsername() + "\n" + " TO: " + reciver.getUsername() + "\n" + " ON: " + date + "\n" + " Текст сообщения: " + text;

    }
}
