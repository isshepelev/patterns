package ru.isshepelev.behavioralPatterns.template;

public class NewsPage extends WebsiteTemplate{


    @Override
    public void showPageContent() {
        System.out.println("News");
    }
}
