package ru.isshepelev.abstractFactory.banking;

import ru.isshepelev.abstractFactory.Developer;
import ru.isshepelev.abstractFactory.ProductManager;
import ru.isshepelev.abstractFactory.ProjectTeamFactory;
import ru.isshepelev.abstractFactory.Tester;



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
