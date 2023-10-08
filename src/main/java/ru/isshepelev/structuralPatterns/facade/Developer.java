package ru.isshepelev.structuralPatterns.facade;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()){
            System.out.println("Разработчик решает проблемы...");
        }else System.out.println("developer балдеет");
    }
}
