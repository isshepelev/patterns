package ru.isshepelev.structuralPatterns.proxy;

public class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("загрузка проекта с " + url);
    }

    @Override
    public void run() {
        System.out.println("запущенный проект " + url);
    }
}
