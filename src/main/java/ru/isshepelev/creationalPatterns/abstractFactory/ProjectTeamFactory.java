package ru.isshepelev.creationalPatterns.abstractFactory;



public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProductManager getProductManager();
}
