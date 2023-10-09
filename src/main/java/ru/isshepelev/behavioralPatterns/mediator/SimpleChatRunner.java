package ru.isshepelev.behavioralPatterns.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();
        User admin = new Admin(chat, "admin");
        User user1 = new SimpleUser("user 1", chat);
        User user2 = new SimpleUser("user 2", chat);

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("привет я первый пользователь");
        admin.sendMessage("я админ");
    }


}
