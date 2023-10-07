package ru.isshepelev.abstractFactory;

import ru.isshepelev.abstractFactory.banking.BankingTeamFactory;
import ru.isshepelev.abstractFactory.banking.PM;

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
