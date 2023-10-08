package ru.isshepelev.structuralPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> developers = new ArrayList<>();

    void addDeveloper(Developer developer){
        developers.add(developer);
    }
    void removeDeveloper(Developer developer){
        developers.remove(developer);
    }
    void createProject(){
        System.out.println("Team creates project...");
        for (Developer developer: developers){
            developer.writeCode();
        }
    }
}
