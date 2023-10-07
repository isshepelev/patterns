package ru.isshepelev.abstractFactory.website;

import ru.isshepelev.abstractFactory.Developer;
import ru.isshepelev.abstractFactory.ProductManager;
import ru.isshepelev.abstractFactory.ProjectTeamFactory;
import ru.isshepelev.abstractFactory.Tester;
import ru.isshepelev.abstractFactory.banking.JavaDeveloper;
import ru.isshepelev.abstractFactory.banking.PM;


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
