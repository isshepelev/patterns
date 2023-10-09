package ru.isshepelev.behavioralPatterns.visitor;

public class JuniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing poor class...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Drop datebase...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating no reliable test");
    }
}
