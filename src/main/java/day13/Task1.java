package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Vasya");
        System.out.println(user1);

        User user2 = new User("Bob");
        user1.subscribe(user2);
        System.out.println(user2);

        User user3 = new User("Kate");

        System.out.println("-------------кто подписан---------------------");

        System.out.println(user1.isSubscribed(user2));
        System.out.println(user1.isSubscribed(user3));

        System.out.println("-------------кто друг---------------------");

        user2.subscribe(user1);
        System.out.println(user1.isFriend(user2));
        System.out.println(user1.isFriend(user3));

        System.out.println("----------------------диалоги-----------------");

        user1.sendMessage(user2, "privet");
        user1.sendMessage(user2, "kak dela");

        user2.sendMessage(user1, "zdorovo");
        user2.sendMessage(user1, "norm");
        user2.sendMessage(user1, "kak y tebya");

        user3.sendMessage(user1, "hi");
        user3.sendMessage(user1, "ya Kate");
        user3.sendMessage(user1, "kak tebya zovyt");

        user1.sendMessage(user3, "hello");
        user1.sendMessage(user3, "Vasya");
        user1.sendMessage(user3, ")))))))");

        user3.sendMessage(user1, "kryto");


        MessageDatabase.showDialog(user1, user3);

        System.out.println("-------------все сообщения------------");
        System.out.println(MessageDatabase.getMessages());
    }
}
