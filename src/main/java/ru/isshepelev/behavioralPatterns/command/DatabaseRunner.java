package ru.isshepelev.behavioralPatterns.command;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(
                new InsertCommand(database),
                new DeleteCommand(database),
                new SelectCommand(database),
                new UpdateCommand(database)
        );
        developer.insertRecord();
        developer.deleteRecord();
        developer.selectRecord();
        developer.updateRecord();
    }

}
