package ru.isshepelev.behavioralPatterns.chain;

public class SimpleReportNotifier extends Notifier{

    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying использует простой репорт: " + message);
    }
}
