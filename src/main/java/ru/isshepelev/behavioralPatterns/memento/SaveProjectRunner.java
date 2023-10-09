package ru.isshepelev.behavioralPatterns.memento;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithubRepo githubRepo = new GithubRepo();

        System.out.println("создание нового проекта Version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("сохранение версии на git");
        System.out.println("пишем плохой код");
        Thread.sleep(5000);
        githubRepo.setSave( project.save());
        System.out.println("обновление версии на гит ");

        project.setVersionAndDate("Version 1.1");


        System.out.println(project);

        System.out.println("что-то случилось!");

        System.out.println("откат к прошлой версии");
        project.load(githubRepo.getSave());
        System.out.println("проект после отката ");
        System.out.println(project);
    }


}
