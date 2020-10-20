package org.example;

public class ClassicalMusic implements Music{
    //ограничение в создании объектов через new
    private ClassicalMusic() {
    }

    //создание фабричного метода (если scope singleton, то объект будет только один!)
    public static ClassicalMusic getClassicalMusic(){
        System.out.println("Created by factory method");
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void doMyInit(){
        System.out.println("Do my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Do my destruction");
    }
}
