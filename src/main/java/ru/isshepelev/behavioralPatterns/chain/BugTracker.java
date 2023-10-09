package ru.isshepelev.behavioralPatterns.chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier report = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier email = new SimpleReportNotifier(Priority.IMPORTANT);
        Notifier sms = new SimpleReportNotifier(Priority.ASAP);

        report.setNextNotifier(email);
        email.setNextNotifier(sms);

        report.notifyManager("все хорошо", Priority.ROUTINE);
        report.notifyManager("что-то не так", Priority.IMPORTANT);
        report.notifyManager("все очень плохо", Priority.ASAP);
    }
}
