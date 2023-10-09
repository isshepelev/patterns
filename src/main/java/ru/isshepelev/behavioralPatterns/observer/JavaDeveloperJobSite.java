package ru.isshepelev.behavioralPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed{
    List<String> vacancies = new ArrayList<>();

    List<Observer> subscribes = new ArrayList<>();
    void addVacancy(String vacancy){
        this.vacancies.add(vacancy);
        notifyObserver();
    }
    void removeVacancy(String vacancy){
        this.vacancies.remove(vacancy);
        notifyObserver();
    }
    @Override
    public void addObserver(Observer observer) {
        subscribes.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribes.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : subscribes){
            o.handleEvent(vacancies);
        }
    }
}
