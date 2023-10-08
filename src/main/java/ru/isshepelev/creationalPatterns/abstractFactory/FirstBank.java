package ru.isshepelev.creationalPatterns.abstractFactory;

import ru.isshepelev.creationalPatterns.abstractFactory.banking.BankingTeamFactory;

public class FirstBank {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProductManager productManager = projectTeamFactory.getProductManager();

        developer.writeCode();
        tester.testCode();
        productManager.manageProject();

    }
}
