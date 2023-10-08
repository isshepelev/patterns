package ru.isshepelev.structuralPatterns.facade;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }
    public void startSprint(){
        System.out.println("sptint активен");
        activeSprint = true;
    }
    public void finishSprint(){
        System.out.println("sprint не активен");
        activeSprint = false;
    }
}
