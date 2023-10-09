package ru.isshepelev.behavioralPatterns.template;

public class WelcomePage extends WebsiteTemplate{

    @Override
    public void showPageContent() {
        System.out.println("Welcom");
    }
}
