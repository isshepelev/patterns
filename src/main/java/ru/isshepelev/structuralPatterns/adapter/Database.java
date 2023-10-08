package ru.isshepelev.structuralPatterns.adapter;

public interface Database {
    void insert();

    void update();

    void select();

    void remove();
}
