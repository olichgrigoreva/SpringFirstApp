package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    //ограничение в создании объектов через new
    private ClassicalMusic() {
    }

    //создание фабричного метода (если scope singleton, то объект будет только один!)
    public static ClassicalMusic getClassicalMusic(){
        System.out.println("Created by factory method");
        return new ClassicalMusic();
    }

    List<String> rockList = new ArrayList<>();

    @Override
    public List getSong() {
        String[] arr = {"Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Richard Strauss"};
        rockList.addAll(Arrays.asList(arr));
        return rockList;
    }
}
