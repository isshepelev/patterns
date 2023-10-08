package ru.isshepelev.factoryMethod;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }
    static DeveloperFactory createDeveloperBySpecialty(String specialty){
        if (specialty.equals("java")){
            return new JavaDeveloperFactory();
        }else if (specialty.equals("c++")){
            return new CppDeveloperFactory();
        }else throw new RuntimeException();
    }
}
