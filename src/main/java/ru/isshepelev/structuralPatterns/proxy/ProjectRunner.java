package ru.isshepelev.structuralPatterns.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://что-то/очень/крутое");
        project.run();
    }
}
