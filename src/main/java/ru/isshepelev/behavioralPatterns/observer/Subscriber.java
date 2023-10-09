package ru.isshepelev.behavioralPatterns.observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Дорогой " + name + " у нас есть изменения в вакансиях " + vacancies);
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
