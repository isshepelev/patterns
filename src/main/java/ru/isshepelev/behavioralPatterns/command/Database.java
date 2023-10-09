package ru.isshepelev.behavioralPatterns.command;

public class Database {
    public void insert(){
        System.out.println("добавляет что-то в базу данных");
    }
    public void update(){
        System.out.println("обновляет что-то в базе данных");
    }
    public void select(){
        System.out.println("находит что-то в базе данных");
    }
    public void delete(){
        System.out.println("удаляет что-то в базе данных");
    }
}
