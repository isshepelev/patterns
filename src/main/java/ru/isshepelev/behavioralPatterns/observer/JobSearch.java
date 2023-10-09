package ru.isshepelev.behavioralPatterns.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite site = new JavaDeveloperJobSite();
        site.addVacancy("first java position");
        site.addVacancy("second java position");

        Observer firstSubscriber = new Subscriber("Илья");
        Observer secondSubscriber = new Subscriber("Дима");

        site.addObserver(firstSubscriber);
        site.addObserver(secondSubscriber);

        site.addVacancy("third java position");
        site.removeVacancy("first java position");
    }
}
