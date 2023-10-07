package ru.isshepelev.abstractFactory;



public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProductManager getProductManager();
}
