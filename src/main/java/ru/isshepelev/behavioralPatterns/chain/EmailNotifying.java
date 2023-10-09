package ru.isshepelev.behavioralPatterns.chain;

public class EmailNotifying extends Notifier{

    public EmailNotifying(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("отправка email: " +message);
    }
}
