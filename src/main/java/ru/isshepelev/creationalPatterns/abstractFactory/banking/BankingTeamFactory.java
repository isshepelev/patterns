package ru.isshepelev.creationalPatterns.abstractFactory.banking;

import ru.isshepelev.creationalPatterns.abstractFactory.Developer;
import ru.isshepelev.creationalPatterns.abstractFactory.ProductManager;
import ru.isshepelev.creationalPatterns.abstractFactory.ProjectTeamFactory;
import ru.isshepelev.creationalPatterns.abstractFactory.Tester;


public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProductManager getProductManager() {
        return new PM();
    }
}
