package ru.isshepelev.creationalPatterns.abstractFactory.website;

import ru.isshepelev.creationalPatterns.abstractFactory.Developer;
import ru.isshepelev.creationalPatterns.abstractFactory.ProductManager;
import ru.isshepelev.creationalPatterns.abstractFactory.ProjectTeamFactory;
import ru.isshepelev.creationalPatterns.abstractFactory.Tester;
import ru.isshepelev.creationalPatterns.abstractFactory.banking.JavaDeveloper;
import ru.isshepelev.creationalPatterns.abstractFactory.banking.PM;


public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProductManager getProductManager() {
        return new PM();
    }
}
