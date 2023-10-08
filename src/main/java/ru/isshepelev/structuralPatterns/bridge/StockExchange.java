package ru.isshepelev.structuralPatterns.bridge;

public class StockExchange extends Program{
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange in progress...");
        developer.writeCode();
    }
}
