package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        MessageDatabase.messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return MessageDatabase.messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message message : MessageDatabase.messages) {
            if (message.getSender().equals(u1) && message.getReceiver().equals(u2)
                    || message.getSender().equals(u2) && message.getReceiver().equals(u1)) {
                System.out.println(message.getSender().getUsername() + ": " + message.getText());
            }
        }
    }
}