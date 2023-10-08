package ru.isshepelev.structuralPatterns.facade;



public class sprintRunner {
    public static void main(String[] args) {
        WorkFlow workFlow = new WorkFlow();
        workFlow.solveProblems();
        workFlow.dontSolveProblems();
    }

}
