package ru.isshepelev.behavioralPatterns.visitor;

public class SeniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting class after junior");
    }

    @Override
    public void create(Database database) {
        System.out.println("fixed database");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable test");
    }
}
