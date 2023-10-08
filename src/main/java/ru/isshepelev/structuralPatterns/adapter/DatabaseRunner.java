package ru.isshepelev.structuralPatterns.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaDatabase();
        database.insert();
        database.remove();
        database.select();
        database.update();
    }
}
