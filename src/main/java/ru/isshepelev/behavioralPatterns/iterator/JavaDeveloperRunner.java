package ru.isshepelev.behavioralPatterns.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"java","spring","postgres"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Илья", skills);
        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: " );
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
